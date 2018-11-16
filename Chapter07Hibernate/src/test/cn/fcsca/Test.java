package cn.fcsca;

import cn.fcsca.factory.HibernateSessionFactory;
import cn.fcsca.model.Detail;
import cn.fcsca.model.Login;
import cn.fcsca.model.Person;
import cn.fcsca.model.Room;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
}
