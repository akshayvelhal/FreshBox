/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox;

import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.ejb.HibernatePersistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;


/**
 *
 * @author Akshay Velhal
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories//(basePackages="com.freshbox.freshbox", entityManagerFactoryRef="emf")
@EntityScan
@ComponentScan
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/FreshBox");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root");

        return dataSource;
    }
    
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws ClassNotFoundException {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        System.err.println("--------------------------------------");
        System.out.println("Executing somehting");
        System.err.println("--------------------------------------");
        entityManagerFactoryBean.setDataSource(getDataSource());
        entityManagerFactoryBean.setPackagesToScan("com.freshbox.freshbox");
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.class);
        
        Properties jpaProterties = new Properties();
        jpaProterties.put("hibernate.temp.use_jdbc_metadata_defaults", false);
        jpaProterties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        
        entityManagerFactoryBean.setJpaProperties(jpaProterties);

        return entityManagerFactoryBean;
    }
}
