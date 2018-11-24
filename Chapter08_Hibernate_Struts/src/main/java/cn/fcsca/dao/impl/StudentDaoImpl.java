package cn.fcsca.dao.impl;

import cn.fcsca.dao.StudentDao;
import cn.fcsca.factory.HibernateSessionFactory;
import cn.fcsca.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * StudentDaoImpl
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:36 2018-11-19
 */
public class StudentDaoImpl implements StudentDao {
    /**
     * 根据学号查询学生信息
     *
     * @param studentNumber
     * @return student
     * @author Fcscanf
     * @date 下午 13:29 2018-11-19
     */
    @Override
    public Student getStudentById(String studentNumber) {
        try {
            Session session = HibernateSessionFactory.getSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from Student where studentNumber=?");
            query.setParameter(0, studentNumber);
            query.setMaxResults(1);
            Student student = (Student) query.uniqueResult();
            transaction.commit();
            session.clear();
            return student;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 修改学生信息
     *
     * @param student
     * @return null
     * @author Fcscanf
     * @date 下午 13:28 2018-11-19
     */
    @Override
    public void updateStudent(Student student) {
        try {
            Session session = HibernateSessionFactory.getSession();
            Transaction transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
            HibernateSessionFactory.closeSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
