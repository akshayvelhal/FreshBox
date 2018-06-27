/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.model;

import com.freshbox.freshbox.domain.Subscription;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Akshay Velhal
 */
public class MealSummary {

    private String day;
    private int vegProteinQty;
    private int chickenProteinQty;
    private int eggProteinQty;
    
    private int vegCount;
    private int nonVegCount;
    private int eggCount;
    
    private List<FreshBoxMeals> freshBoxMeals;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getVegProteinQty() {
        return vegProteinQty;
    }

    public void setVegProteinQty(int vegProteinQty) {
        this.vegProteinQty = vegProteinQty;
    }

    public int getChickenProteinQty() {
        return chickenProteinQty;
    }

    public void setChickenProteinQty(int chickenProteinQty) {
        this.chickenProteinQty = chickenProteinQty;
    }

    public int getEggAllowedMembers() {
        return eggProteinQty;
    }

    public void setEggAllowedMembers(int eggAllowedMembers) {
        this.eggProteinQty = eggAllowedMembers;
    }

    public int getVegCount() {
        return vegCount;
    }

    public void setVegCount(int vegCount) {
        this.vegCount = vegCount;
    }

    public int getNonVegCount() {
        return nonVegCount;
    }

    public void setNonVegCount(int nonVegCount) {
        this.nonVegCount = nonVegCount;
    }

    public List<FreshBoxMeals> getFreshBoxMeals() {
        return freshBoxMeals;
    }

    public void setFreshBoxMeals(List<FreshBoxMeals> freshBoxMeals) {
        this.freshBoxMeals = freshBoxMeals;
    }
    
    public int getEggCount() {
        return eggCount;
    }

    public void setEggCount(int eggCount) {
        this.eggCount = eggCount;
    }
    
    public void copyFrom(List<Subscription> subscriptions, String day) {
        this.day = day;
        this.vegProteinQty = 0;
        this.chickenProteinQty = 0;
        this.eggProteinQty = 0;
        this.nonVegCount = 0;
        this.vegCount = 0;
        this.eggCount = 0;
        this.freshBoxMeals = new LinkedList<>();
        
        subscriptions.forEach(subscription -> {
            FreshBoxMeals fbMeal = FreshBoxMeals.copyFrom(subscription, day);
            this.freshBoxMeals.add(fbMeal);
            
            switch(fbMeal.getFoodPreference()) {
                case Constants.FOODPREFERENCEVEG:
                    this.vegProteinQty += subscription.getProteinGrams();
                    this.vegCount++;
                    break;
                case Constants.FOODPREFERENCENONVEG:
                    this.chickenProteinQty += subscription.getProteinGrams();
                    this.nonVegCount++;
                    break;
                case Constants.FOODPREFERENCEEGGS:
                    this.eggProteinQty += subscription.getProteinGrams();
                    this.eggCount++;
                    break;
            }
        });
    }
    
    
}
