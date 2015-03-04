package com.orix.service.serviceImpl;

import com.orix.dao.UserDao;
import com.orix.entity.User;
import com.orix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Inf1mum on 02.03.2015.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;


    @Override
    @Transactional
    public User getUserById(Integer id) {
        return userDao.get(id);
    }
}
