package cn.fcsca.dao.impl;

import cn.fcsca.dao.LoginDao;
import cn.fcsca.model.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * LoginDaoImpl
 *
 * @author Fcscanf
 * @description
 * @date 下午 22:54 2018-12-04
 */
public class LoginDaoImpl implements LoginDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Login login) {
        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(login);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
