/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.service;

import com.freshbox.freshbox.model.MealSummary;

/**
 *
 * @author Akshay Velhal
 */
public interface SubscriptionService {
    
    public MealSummary getSummary(String date, String LunchORDinner);
    
}
