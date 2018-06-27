/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Akshay Velhal
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CustomerId")
    private Long customerId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone", nullable = false)
    private long phone;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "extraDetails", nullable = false)
    private String extraDetails;

    @OneToOne
    @JoinColumn(name = "DeliveryGuyId")
    @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="deliveryGuyId")
    private DeliveryGuy deliveryGuy;
    
    @OneToOne
    @JoinColumn(name = "foodPreferenceId")
    @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="foodPreferenceId")
    private FoodPreference foodPreference;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExtraDetails() {
        return extraDetails;
    }

    public void setExtraDetails(String extraDetails) {
        this.extraDetails = extraDetails;
    }

    public DeliveryGuy getDeliveryGuy() {
        return deliveryGuy;
    }

    public void setDeliveryGuy(DeliveryGuy deliveryGuy) {
        this.deliveryGuy = deliveryGuy;
    }

    public FoodPreference getFoodPreference() {
        return foodPreference;
    }

    public void setFoodPreference(FoodPreference foodPreference) {
        this.foodPreference = foodPreference;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", name=" + name + ", phone=" + phone + ", address=" + address + ", extraDetails=" + extraDetails + ", deliveryGuy=" + deliveryGuy + ", foodPreference=" + foodPreference + '}';
    }
    
}
