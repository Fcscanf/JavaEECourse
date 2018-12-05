package cn.fcsca.dao.impl;

import cn.fcsca.dao.LoginDao;
import cn.fcsca.model.Login;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * LoginDaoImp
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:24 2018-12-04
 */
public class LoginDaoImp extends HibernateDaoSupport implements LoginDao {
    @Override
    public void save(Login login) {
        getHibernateTemplate().save(login);
    }
}
