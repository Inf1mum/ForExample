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
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login() {
        System.out.println("login");
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        System.out.println("logout");
        return "login";
    }

}
