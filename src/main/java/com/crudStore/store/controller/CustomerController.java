package com.crudStore.store.controller;

import com.crudStore.store.dao.CustomerDao;
import com.crudStore.store.entity.Customer;
import com.crudStore.store.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> loadAllCustomer(){
        System.out.println("No customer list in Controller");
        return customerService.loadAllCustomer();
    }
}
