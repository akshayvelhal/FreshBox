/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.model;

import com.freshbox.freshbox.domain.Customer;
import com.freshbox.freshbox.domain.DeliveryGuy;
import com.freshbox.freshbox.domain.FoodPreference;
import com.freshbox.freshbox.domain.Subscription;

/**
 *
 * @author Akshay Velhal
 */
public class FreshBoxMeals {

    private Long customerId;
    private String name;
    private long phone;
    private String address;
    private String extraDetails;
    private DeliveryGuy deliveryGuy;
    private String foodPreference;
    private int proteinGrams;
    private boolean isRepeat;

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

    public String getFoodPreference() {
        return foodPreference;
    }

    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    public int getProteinGrams() {
        return proteinGrams;
    }

    public void setProteinGrams(int proteinGrams) {
        this.proteinGrams = proteinGrams;
    }
    
    public boolean isIsRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(boolean isRepeat) {
        this.isRepeat = isRepeat;
    }
    
    public static FreshBoxMeals copyFrom(Subscription subscription, String day) {
        Customer customer = subscription.getCustomer();
        FreshBoxMeals freshBoxMeals = new FreshBoxMeals();
        freshBoxMeals.customerId = customer.getCustomerId();
        freshBoxMeals.name = customer.getName();
        freshBoxMeals.address = customer.getAddress();
        freshBoxMeals.extraDetails = customer.getAddress();
        freshBoxMeals.deliveryGuy = customer.getDeliveryGuy();
        freshBoxMeals.proteinGrams = subscription.getProteinGrams();
        
        FoodPreference foodPreference = customer.getFoodPreference();
        switch(day) {
            case Constants.MONDAY:
                freshBoxMeals.foodPreference = foodPreference.getMonday();
                break;
            case Constants.TUESDAY:
                freshBoxMeals.foodPreference = foodPreference.getTuesday();
                break;
            case Constants.WEDNESDAY:
                freshBoxMeals.foodPreference = foodPreference.getWednesday();
                break;
            case Constants.THURSDAY:
                freshBoxMeals.foodPreference = foodPreference.getThursday();
                break;
             case Constants.FRIDAY:
                freshBoxMeals.foodPreference = foodPreference.getFriday();
                break;
        }
        return freshBoxMeals;
    }
    
        
}
