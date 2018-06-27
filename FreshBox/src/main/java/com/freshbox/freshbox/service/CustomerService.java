/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.service;

import com.freshbox.freshbox.domain.Customer;
import com.freshbox.freshbox.exception.CustomerNotFoundException;

/**
 *
 * @author Akshay Velhal
 */
public interface CustomerService {
    
    public Customer createUser(Customer user);
    public Customer getUser(long userId) throws CustomerNotFoundException;
}
