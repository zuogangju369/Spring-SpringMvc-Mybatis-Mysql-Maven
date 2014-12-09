package com.controller;

import com.model.User;
import com.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Feeling on 2014/12/9.
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    private UserServiceI userService;

    public UserServiceI getUserService() {
        return userService;
    }
    @Autowired
    public void setUserService(UserServiceI userService) {
        this.userService = userService;
    }

    @RequestMapping("{id}/showUser/")
    public String showUser(@PathVariable String id,HttpServletRequest request){
        User u=userService.getUserById(id);
         request.setAttribute("user",u);
        return "showUser";
    }
 /*   @RequestMapping("/showUsers/{id}")
    public ModelAndView showUsers(@PathVariable String id,HttpServletRequest request){
        User u=userService.getUserById(id);
        ModelAndView mav = new ModelAndView("showUser");
        mav.addObject("message","aaa");
        mav.addObject("user",u);
        return mav;
    }*/
}
