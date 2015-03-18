package com.orix.dao;

import com.orix.entity.User;

/**
 * Created by Inf1mum on 02.03.2015.
 */
public interface UserDao extends GenericDao<User,Integer> {

    public User getUserByLogin(String login);

}
