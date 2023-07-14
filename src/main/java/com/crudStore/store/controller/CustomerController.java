package com.crudStore.store.controller;


import com.crudStore.store.entity.Customer;
import com.crudStore.store.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService cusService){
        customerService = cusService;
    }

    @GetMapping
    public List<Customer> loadAllCustomer(){
        System.out.println("No customer list in Controller");
        return customerService.loadAllCustomer();
    }

    @PostMapping(value = "/save")
    public String saveCustomer(@RequestBody Customer customer){
        System.out.println("received customer Object"+customer);
        customerService.saveCustomer(customer);
        return customer.getId()+" Customer saved Successfully!!";
    }
}
