package dao.impl;

import dao.UserDao;
import model.User;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class UserDaoImpl extends CrudDaoImpl<User> implements UserDao {

    @Override
    public User getByEmail(String email) {
        final Session session = getSession();
        final CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        final CriteriaQuery<User> query = criteriaBuilder.createQuery(User.class);
        final Root<User> root = query.from(User.class);
        query.select(root)
            .where(criteriaBuilder.equal(root.get("email"), email));
        final User user = session.createQuery(query).getSingleResult();
        session.close();
        return user;
    }

    private Session getSession() {
        return HibernateUtil.getSessionFactory().openSession();
    }
}
