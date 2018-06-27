/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.service.impl;

import com.freshbox.freshbox.model.MealSummary;
import com.freshbox.freshbox.repository.SubscriptionRepository;
import com.freshbox.freshbox.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Akshay Velhal
 */
@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    
    @Autowired
    SubscriptionRepository subscriptionRepository;
    
    @Override
    public MealSummary getSummary(String date, String LunchORDinner) {
        
        return null;
        
    }
    
}
