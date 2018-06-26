/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.service;

import com.freshbox.freshbox.domain.User;

/**
 *
 * @author Akshay Velhal
 */
public interface UserService {
    
    public void createUser(User user);
    public User getUser(int userId);
}
