package cn.fcsca;

import cn.fcsca.factory.HibernateSessionFactory;
import cn.fcsca.model.Detail;
import cn.fcsca.model.Login;
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
    public static void main(String[] args) {
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
}
