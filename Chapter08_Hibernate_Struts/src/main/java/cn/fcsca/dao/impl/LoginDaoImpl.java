package cn.fcsca.dao.impl;

import cn.fcsca.dao.LoginDao;
import cn.fcsca.factory.HibernateSessionFactory;
import cn.fcsca.model.Login;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * LoginDaoImpl
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:04 2018-11-19
 */
public class LoginDaoImpl implements LoginDao {

    /**
     * 学生的登录验证
     *
     * @param studentNumber
     * @param password
     * @return
     * @author Fcscanf
     * @date 下午 13:03 2018-11-19
     */
    @Override
    public Login validate(String studentNumber, String password) {
        try {
            Session session = HibernateSessionFactory.getSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from Login where studentNumber=? and password=?");
            query.setParameter(0, studentNumber);
            query.setParameter(1, password);
            query.setMaxResults(1);
            Login login = (Login) query.uniqueResult();
            if (login != null) {
                return login;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
