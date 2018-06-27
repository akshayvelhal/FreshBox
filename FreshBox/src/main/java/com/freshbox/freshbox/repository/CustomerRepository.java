/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.repository;

import com.freshbox.freshbox.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Akshay Velhal
 */
@Repository("CustomerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
    
    
}
