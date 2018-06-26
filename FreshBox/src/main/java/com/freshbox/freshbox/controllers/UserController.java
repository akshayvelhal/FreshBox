/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.controllers;

import com.freshbox.freshbox.domain.User;
import com.freshbox.freshbox.service.UserService;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Akshay Velhal
 */
@RestController
@RequestMapping(value = "/api")
public class UserController {
    
    @Autowired
    UserService userService;
 
    @RequestMapping(value = "/user", method = RequestMethod.POST) 
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createUser(HttpServletResponse response, @RequestBody User user){
        userService.createUser(user);
    }
    
    
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET) 
    public User createUser(HttpServletResponse response, @PathVariable int userId){
        return userService.getUser(userId);
    }
    
    
}
