package cn.fcsca.action;

import cn.fcsca.db.DB;
import cn.fcsca.model.Student;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;

/**
 * SaveAction
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:32 2018-11-13
 */
@Data
public class SaveAction extends ActionSupport {

    private Student student;

    @Override
    public String execute() throws Exception {
        DB db = new DB();
        Student student1 = new Student();
        student1.setId(student.getId());
        student1.setName(student.getName());
        student1.setGender(student.getGender());
        student1.setProfessional(student.getProfessional());
        student1.setBirthday(student.getBirthday());
        student1.setNote(student.getNote());
        if (db.save(student1)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
