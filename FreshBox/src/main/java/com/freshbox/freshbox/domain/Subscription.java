/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.Date;
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
@Table(name = "subscription")
public class Subscription implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "subscriptionId")
    private Long subscriptionId;
    
    @Column(name = "startDate", nullable = false)
    private Date startDate;
    
    @Column(name = "subscribingFor", nullable = false)
    private String subscribingFor;
    
    @Column(name = "subscriptionPeriod", nullable = false)
    private int subscriptionPeriod;
    
    @Column(name = "freshBoxPlan", nullable = false)
    private String freshBoxPlan;
    
    @Column(name = "proteinGrams", nullable = false)
    private int proteinGrams;
    
    @Column(name = "paymentMode", nullable = false)
    private String paymentMode;
    
    @Column(name = "amountCharged", nullable = false)
    private int amountCharged;
    
    @Column(name = "amountPaid", nullable = false)
    private int amountPaid;
    
    @Column(name = "isFreezed", nullable = false)
    private boolean isFreezed;
    
    @Column(name = "isActive", nullable = false)
    private boolean isActive;
    
    @OneToOne
    @JoinColumn(name = "customerId")
    @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="customerId")
    private Customer customer;

    public Long getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getSubscribingFor() {
        return subscribingFor;
    }

    public void setSubscribingFor(String subscribingFor) {
        this.subscribingFor = subscribingFor;
    }

    public int getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    public void setSubscriptionPeriod(int subscriptionPeriod) {
        this.subscriptionPeriod = subscriptionPeriod;
    }

    public String getFreshBoxPlan() {
        return freshBoxPlan;
    }

    public void setFreshBoxPlan(String freshBoxPlan) {
        this.freshBoxPlan = freshBoxPlan;
    }

    public int getProteinGrams() {
        return proteinGrams;
    }

    public void setProteinGrams(int proteinGrams) {
        this.proteinGrams = proteinGrams;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(int amountCharged) {
        this.amountCharged = amountCharged;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public boolean isIsFreezed() {
        return isFreezed;
    }

    public void setIsFreezed(boolean isFreezed) {
        this.isFreezed = isFreezed;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
}
