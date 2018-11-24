package cn.fcsca.action;

import cn.fcsca.dao.ProfessionalDao;
import cn.fcsca.dao.StudentDao;
import cn.fcsca.dao.impl.CourseDaoImpl;
import cn.fcsca.dao.impl.ProfesssionalDaoImpl;
import cn.fcsca.dao.impl.StudentDaoImpl;
import cn.fcsca.model.Course;
import cn.fcsca.model.Login;
import cn.fcsca.model.Professional;
import cn.fcsca.model.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * StudentAction
 *
 * @author Fcscanf
 * @description
 * @date 下午 18:34 2018-11-19
 */
public class StudentAction extends ActionSupport {

    private Student student;
    private Course course;
    private File photoFile;
    private Professional professional;
    StudentDao studentDao;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public File getPhotoFile() {
        return photoFile;
    }

    public void setPhotoFile(File photoFile) {
        this.photoFile = photoFile;
    }

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Login user = (Login) session.get("user");
        studentDao = new StudentDaoImpl();
        Student student = studentDao.getStudentById(user.getStudentNumber());
        Map request = (Map) ActionContext.getContext().get("request");
        request.put("student", student);
        return SUCCESS;
    }

    /**
     * 获取照片
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 21:37 2018-11-19
     */
    public String getImage() throws IOException {
        studentDao = new StudentDaoImpl();
        byte[] photo = studentDao.getStudentById(student.getStudentNumber()).getPhoto();
        javax.servlet.http.HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("image/jpeg");
        ServletOutputStream outputStream = response.getOutputStream();
        if (photo != null && photo.length > 0) {
            for (int i = 0; i < photo.length; i++) {
                outputStream.write(photo[i]);
            }
        }
        return NONE;
    }

    public String updateStudentInfo() {
        Map session = ActionContext.getContext().getSession();
        Login user = (Login) session.get("user");
        studentDao = new StudentDaoImpl();
        ProfessionalDao professionalDao = new ProfesssionalDaoImpl();
        List selectProfessional = professionalDao.getAllProfessional();
        Student student = studentDao.getStudentById(user.getStudentNumber());
        Map request = (Map) ActionContext.getContext().get("request");
        request.put("selectProfessional", selectProfessional);
        request.put("student", student);
        return SUCCESS;
    }

    public String updateStudent() throws IOException {
        studentDao = new StudentDaoImpl();
        ProfessionalDao professionalDao = new ProfesssionalDaoImpl();
        Student student1 = new Student();
        student1.setStudentNumber(student.getStudentNumber());
        Set list = studentDao.getStudentById(student.getStudentNumber()).getCourse();
        student1.setCourse(list);
        student1.setStudentName(student.getStudentName());
        student1.setGender(student.getGender());
        student1.setBirthday(student.getBirthday());
        student1.setTotalCredit(student.getTotalCredit());
        student1.setNote(student.getNote());
        Professional professional1 = professionalDao.getProfessionalById(professional.getId());
        student1.setProfessional(professional1);
        if (this.getPhotoFile() != null) {
            FileInputStream fileInputStream = new FileInputStream(this.getPhotoFile());
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            student1.setPhoto(buffer);
        }
        studentDao.updateStudent(student1);
        return SUCCESS;
    }

    public String getStudentCourse() {
        Map session = ActionContext.getContext().getSession();
        Login user = (Login) session.get("user");
        String studentNumber = user.getStudentNumber();
        Student student1 = new StudentDaoImpl().getStudentById(studentNumber);
        Set list = student1.getCourse();
        Map request = (Map) ActionContext.getContext().get("request");
        request.put("list", list);
        return SUCCESS;
    }

    public String deleteCourse() {
        Map session = ActionContext.getContext().getSession();
        String studentNumber = ((Login) session.get("user")).getStudentNumber();
        studentDao = new StudentDaoImpl();
        Student student1 = studentDao.getStudentById(studentNumber);
        Set list = student1.getCourse();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Course course1 = (Course) iterator.next();
            if (course1.getCourseNumber().equals(course.getCourseNumber())) {
                iterator.remove();
            }
        }
        student1.setCourse(list);
        studentDao.updateStudent(student1);
        return SUCCESS;
    }

    public String selectCourse() {
        Map session = ActionContext.getContext().getSession();
        String studentNumber = ((Login) session.get("user")).getStudentNumber();
        studentDao = new StudentDaoImpl();
        Student student1 = studentDao.getStudentById(studentNumber);
        Set list = student1.getCourse();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Course course1 = (Course) iterator.next();
            if (course1.getCourseNumber().equals(course.getCourseNumber())) {
                return ERROR;
            }
        }
        list.add(new CourseDaoImpl().getCourseById(course.getCourseNumber()));
        student1.setCourse(list);
        studentDao.updateStudent(student1);
        return SUCCESS;
    }
}
