package com.bbt.edsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;


@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String User(ModelMap model, Principal principal) {

        String name = principal.getName();

        model.addAttribute("username", name);

        return "hello";
    }
}
