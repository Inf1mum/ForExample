package com.orix.service;

import com.orix.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by Inf1mum on 02.03.2015.
 */

public interface UserService {

     User getUserById(Integer id);

}
