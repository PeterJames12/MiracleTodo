package dao.impl;

import dao.CrudDao;
import org.hibernate.Session;
import util.HibernateUtil;

public class CrudDaoImpl<T> implements CrudDao<T> {

    /**
     * {@inheritDoc}.
     */
    @Override
    public T save(T entity) {
        final Session session = getSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
        return entity;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public T update(T entity) {
        final Session session = getSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
        return entity;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void delete(T entity) {
        final Session session = getSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }

    private Session getSession() {
        return HibernateUtil.getSessionFactory().openSession();
    }
}
