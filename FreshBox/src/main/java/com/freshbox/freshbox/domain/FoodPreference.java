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
@Table(name = "FoodPreference")
public class FoodPreference implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foodPreferenceId")
    private Long foodPreferenceId;
    
    @Column(name = "monday", nullable=false)
    private String monday;
    
    @Column(name = "tuesday", nullable=false)
    private String tuesday;
    
    @Column(name = "wednesday", nullable=false)
    private String wednesday;
    
    @Column(name = "thursday", nullable=false)
    private String thursday;
    
    @Column(name = "friday", nullable=false)
    private String friday;

    public Long getFoodPreferenceId() {
        return foodPreferenceId;
    }

    public void setFoodPreferenceId(Long foodPreferenceId) {
        this.foodPreferenceId = foodPreferenceId;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    @Override
    public String toString() {
        return "FoodPreference{" + "foodPreferenceId=" + foodPreferenceId + ", monday=" + monday + ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday=" + thursday + ", friday=" + friday + '}';
    }
    
}
