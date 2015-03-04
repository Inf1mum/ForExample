package com.orix.dao.daoImpl;

import com.orix.dao.UserDao;
import com.orix.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Inf1mum on 02.03.2015.
 */
@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User,Integer> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }

}
