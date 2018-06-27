/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.controllers;

import com.freshbox.freshbox.domain.DeliveryGuy;
import com.freshbox.freshbox.service.DeliveryGuyService;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Akshay Velhal
 */
@RestController
@RequestMapping(value = "/api")
public class DeliveryGuyController {
    
    @Autowired
    DeliveryGuyService deliveryGuyService;
    
    @RequestMapping(value = "/deliveryguy", method = RequestMethod.GET) 
    public List<DeliveryGuy> createUser(HttpServletResponse response){
        return deliveryGuyService.getDeliveryGuys();
    }
    
}
