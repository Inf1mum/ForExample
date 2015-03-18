package com.orix.controller;

import com.orix.entity.User;
import com.orix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Inf1mum on 15.03.2015.
 */
public class BaseController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    ModelAndView createGeneralModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String login = auth.getName();
        User user = userService.getUserByLogin(login);
        modelAndView.addObject("curUser", user);
        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex){
        System.out.println("exeption");
        ModelAndView modelAndView = new ModelAndView("errorPage") ;
        modelAndView.addObject("msg", "Something went wrong!");
        return modelAndView;
    }


}
