package com.shop.site.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.shop.site.model.Address;
import com.shop.site.model.Customer;

@Repository
public class CustomerService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private MongoOperations mongoOperations;

    public void addCustomer(Customer customer, Address address) {
        System.out.println("Inside addCustomer service ::::");
        if (!mongoTemplate.collectionExists(Customer.class)) {
            mongoTemplate.createCollection(Customer.class);
        }
        if (!mongoTemplate.collectionExists(Address.class)) {
            mongoTemplate.createCollection(Address.class);
        }
        customer.setId(UUID.randomUUID().toString());
        customer.setAddress(address);
        mongoTemplate.insert(customer, "customer");
    }

    public List<Customer> listCustomer() {
        return mongoTemplate.findAll(Customer.class, "customer");
    }

    public List<Customer> searchCustomerByName(String customerName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").is(customerName));
        List<Customer> customers = mongoOperations.find(query, Customer.class);
        return customers;
    }

    public List<Customer> searchCustomerByPhone(String customerPhone) {
        Query query = new Query();
        query.addCriteria(Criteria.where("address.phoneNumber").is(customerPhone));
        List<Customer> customers = mongoOperations.find(query, Customer.class);
        return customers;
    }
    
    public void deleteCustomer(Customer customer){
        mongoTemplate.remove(customer, "customer");
    }

}
