/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.controllers;

import com.freshbox.freshbox.domain.Customer;
import com.freshbox.freshbox.exception.CustomerNotFoundException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.freshbox.freshbox.service.CustomerService;

/**
 *
 * @author Akshay Velhal
 */
@RestController
@RequestMapping(value = "/api")
public class CustomerController {
    
    @Autowired
    CustomerService customerService;
 
    @RequestMapping(value = "/customer", method = RequestMethod.POST) 
    @ResponseStatus(value = HttpStatus.CREATED)
    public Customer createUser(HttpServletResponse response, @RequestBody Customer user){
        return customerService.createUser(user);
    }
    
    
    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET) 
    public Customer getUser(HttpServletResponse response, @PathVariable long customerId) throws CustomerNotFoundException{
        return customerService.getUser(customerId);
    }
    
    
}
