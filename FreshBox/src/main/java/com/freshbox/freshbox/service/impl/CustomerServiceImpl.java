/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.service.impl;

import com.freshbox.freshbox.domain.Customer;
import com.freshbox.freshbox.domain.FoodPreference;
import com.freshbox.freshbox.exception.CustomerNotFoundException;
import com.freshbox.freshbox.repository.CustomerRepository;
import com.freshbox.freshbox.repository.FoodPreferenceRepository;
import com.freshbox.freshbox.service.CustomerService;
import com.freshbox.freshbox.service.CustomerService;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Akshay Velhal
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    FoodPreferenceRepository foodPreferenceRepository;
    
    @Override
    @Transactional
    public Customer createUser(Customer customer) {
        FoodPreference inputPref = customer.getFoodPreference();
        inputPref = foodPreferenceRepository.save(inputPref);
        
        customer.setFoodPreference(inputPref);
        Customer newCustomer = customerRepository.save(customer);
        System.err.println(newCustomer);
        return newCustomer;
    }

    @Override
    public Customer getUser(long userId) throws CustomerNotFoundException {
        Optional<Customer> customer = customerRepository.findById(userId);
        if(customer.isPresent()) {
            return customer.get();
        }
        throw new CustomerNotFoundException("Customer does not exist");
    }
    
}
