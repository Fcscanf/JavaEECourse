package cn.fcsca;

import cn.fcsca.factory.HibernateSessionFactory;
import cn.fcsca.model.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

/**
 * Test
 *
 * @author Fcscanf
 * @description
 * @date 上午 8:56 2018-11-16
 */
public class Test {

    /**
     * 一对一关联
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 23:02 2018-11-16
     */
    @org.junit.Test
    public void OneToOneTest() {
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        Detail detail = new Detail();
        Login login = new Login();
        login.setUsername("FCC");
        login.setPassword("123");
        detail.setTruename("DFD");
        detail.setEmail("fcscanf@126.com");
        login.setDetail(detail);
        detail.setLogin(login);
        session.save(detail);
        transaction.commit();
        HibernateSessionFactory.closeSession();
    }

    /**
     * 唯一外键测试
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 23:03 2018-11-16
     */
    @org.junit.Test
    public void UniqueForige() {
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        person.setName("FCC");
        Room room = new Room();
        room.setAddress("北京市");
        person.setRoom(room);
        session.save(person);
        transaction.commit();
        HibernateSessionFactory.closeSession();
    }

    /**
     * 多对一单向关联测试
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 23:03 2018-11-16
     */
    @org.junit.Test
    public void MoreToOneTest() {
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        Room room = new Room();
        person.setName("DGG");
        room.setAddress("南京市");
        person.setRoom(room);
        session.save(person);
        transaction.commit();
        HibernateSessionFactory.closeSession();
    }

    /**
     * 一对多双向关联测试
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 23:03 2018-11-16
     */
    @org.junit.Test
    public void OneToMoreTest() {
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        Person person1 = new Person();
        Person person2 = new Person();
        Room room = new Room();
        person1.setName("白金卡");
        person2.setName("电子卡");
        room.setAddress("重庆市");
        person1.setRoom(room);
        person2.setRoom(room);
        session.save(person1);
        session.save(person2);
        transaction.commit();
        HibernateSessionFactory.closeSession();
    }

    /**
     * 一对多双向关联测试
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 23:03 2018-11-16
     */
    @org.junit.Test
    public void OneToMoreTest1() {
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        Person person1 = new Person();
        Person person2 = new Person();
        Room room = new Room();
        person1.setName("中国银行");
        person2.setName("建设银行");
        Set people = new HashSet();
        people.add(person1);
        people.add(person2);
        room.setAddress("重庆市");
        room.setPerson(people);
        session.save(room);
        transaction.commit();
        HibernateSessionFactory.closeSession();
    }

    /**
     * 多对多关联 
     *
     * @param
     * @return 
     * @author Fcscanf
     * @date 下午 20:34 2018-11-17 
     */
    @org.junit.Test
    public void MoreToMoreTest() {
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        course1.setCourseNumber("101");
        course1.setCourseName("计算机基础");
        course2.setCourseNumber("102");
        course2.setCourseName("数据库原理");
        course3.setCourseNumber("103");
        course3.setCourseName("计算机原理");
        Set course = new HashSet();
        course.add(course1);
        course.add(course2);
        course.add(course3);
        Student student = new Student();
        student.setName("歌莉娅");
        student.setGender(1);
        student.setBirthday("1998.9.16");
        student.setProfessional("软件工程");
        student.setNote("嵌入式");
        student.setCourse(course);
        session.save(student);
        transaction.commit();
        HibernateSessionFactory.closeSession();
    }
}
