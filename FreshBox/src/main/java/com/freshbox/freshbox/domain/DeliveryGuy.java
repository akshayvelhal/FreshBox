/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Akshay Velhal
 */
@Entity
@Table(name = "DeliveryGuy")
public class DeliveryGuy implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeliveryGuyId")
    private Long deliveryGuyId;
    
    @Column(name = "Name", nullable=false)
    private String name;

    public Long getDeliveryGuyId() {
        return deliveryGuyId;
    }

    public void setDeliveryGuyId(Long deliveryGuyId) {
        this.deliveryGuyId = deliveryGuyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeliveryGuy{" + "deliveryGuyId=" + deliveryGuyId + ", name=" + name + '}';
    }
    
}
