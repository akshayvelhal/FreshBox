/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.controllers;

import com.freshbox.freshbox.model.MealSummary;
import com.freshbox.freshbox.service.SubscriptionService;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Akshay Velhal
 */
@RestController
@RequestMapping(value = "/api")
public class SubscriptionController {
    
    @Autowired
    SubscriptionService subscriptionService;
 
    @RequestMapping(value = "/count", method = RequestMethod.GET) 
    public MealSummary getSaladCount(HttpServletResponse response, 
            @RequestParam String date, @RequestParam String countOf) {
        return subscriptionService.getSummary(date, countOf);
    }
    
}
