package cn.fcsca.dao.impl;

import cn.fcsca.dao.ProfessionalDao;
import cn.fcsca.factory.HibernateSessionFactory;
import cn.fcsca.model.Professional;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * ProfesssionalDaoImpl
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:35 2018-11-19
 */
public class ProfesssionalDaoImpl implements ProfessionalDao {
    /**
     * 根据专业ID查询专业信息
     *
     * @param professionalId
     * @return Professional
     * @author Fcscanf
     * @date 下午 13:31 2018-11-19
     */
    @Override
    public Professional getProfessionalById(Integer professionalId) {
        try {
            Session session = HibernateSessionFactory.getSession();
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from Professional where id=?");
            query.setParameter(0, professionalId);
            query.setMaxResults(1);
            Professional professional = (Professional) query.uniqueResult();
            transaction.commit();
            session.clear();
            return professional;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查询所有专业信息
     *
     * @return list
     * @author Fcscanf
     * @date 下午 13:31 2018-11-19
     */
    @Override
    public List getAllProfessional() {
        try {
            Session session = HibernateSessionFactory.getSession();
            Transaction transaction = session.beginTransaction();
            List list = session.createQuery("from Professional ").list();
            transaction.commit();
            HibernateSessionFactory.closeSession();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
