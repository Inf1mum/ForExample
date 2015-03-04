package com.orix.controller;

/**
 * Created by Inf1mum on 01.03.2015.
 */
import com.orix.dao.UserDao;
import com.orix.dao.daoImpl.GenericDaoImpl;
import com.orix.entity.User;
import com.orix.service.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Login {

    @Autowired
    @Qualifier("userService")
    private UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        String message=userService.getUserById(5).getEmail();
        model.addAttribute("message", message);
        return "index";
    }

}
