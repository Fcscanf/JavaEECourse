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
}
