package cn.fcsca.dao.impl;

import cn.fcsca.dao.CourseDao;
import cn.fcsca.factory.HibernateSessionFactory;
import cn.fcsca.model.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * CourseDaoImpl
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:34 2018-11-19
 */
public class CourseDaoImpl implements CourseDao {
    /**
     * 通过课程id获取专业信息
     *
     * @param courseId
     * @return course
     * @author Fcscanf
     * @date 下午 13:33 2018-11-19
     */
    @Override
    public Course getCourseById(String courseId) {
        try {
            Session session = HibernateSessionFactory.getSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from Course where courseNumber=?");
            query.setParameter(0, courseId);
            query.setMaxResults(1);
            Course course = (Course) query.uniqueResult();
            transaction.commit();
            session.clear();
            return course;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取所有的课程信息
     *
     * @return list
     * @author Fcscanf
     * @date 下午 13:34 2018-11-19
     */
    @Override
    public List getAllCourse() {
        try {
            Session session = HibernateSessionFactory.getSession();
            Transaction transaction = session.beginTransaction();
            List list = session.createQuery("from Course order by courseNumber").list();
            transaction.commit();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
