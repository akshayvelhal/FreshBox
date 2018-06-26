/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.service;

import com.freshbox.freshbox.domain.DeliveryGuy;
import com.freshbox.freshbox.domain.User;
import com.freshbox.freshbox.repository.DeliveryGuyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Akshay Velhal
 */
@Service
public class UserServiceImpl implements UserService {

    
    @Autowired
    DeliveryGuyRepository deliveryGuyRepository;
    
    @Override
    public void createUser(User user) {
        System.out.println("New User Created");
    }

    @Override
    public User getUser(int userId) {
        System.out.println("Get user details");
        
        List<DeliveryGuy> guys = deliveryGuyRepository.findAll();
        guys.stream().forEach( guy -> System.out.println("Guy - "+ guy.getName()));
        
        return new User();
    }
    
}
