package com.orix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Inf1mum on 15.03.2015.
 */
@Controller
public class UserController extends BaseController {

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public String user() {
        System.out.println("user");
        return "userList";
    }

    @RequestMapping(value="/about", method = RequestMethod.GET)
    public String about() {
        System.out.println("about");
        return "about";
    }
}
