/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.service.impl;

import com.freshbox.freshbox.domain.DeliveryGuy;
import com.freshbox.freshbox.repository.DeliveryGuyRepository;
import com.freshbox.freshbox.service.DeliveryGuyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Akshay Velhal
 */
@Service
public class DeliveryGuyServiceImpl implements DeliveryGuyService{
    
    @Autowired
    DeliveryGuyRepository deliveryGuyRepository;

    @Override
    public List<DeliveryGuy> getDeliveryGuys() {
        return deliveryGuyRepository.findAll();
    }
    
}
