package com.orix.dao.daoImpl;

import com.orix.dao.UserDao;
import com.orix.entity.User;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

/**
 * Created by Inf1mum on 02.03.2015.
 */
@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User,Integer> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }

    @Override
    public User getUserByLogin(String login) {

        String hql = "select user from User user where user.login = :login";
        User user = (User) getCurrentSession().createQuery(hql)
                .setString("login", login)
                .uniqueResult();
        Hibernate.initialize(user.getRole());
        return user;
    }
}
