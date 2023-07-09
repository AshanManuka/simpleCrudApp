package com.crudStore.store.service;

import com.crudStore.store.entity.Customer;
import com.crudStore.store.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepo;


    @Autowired
    public CustomerServiceImpl(CustomerRepository cusRepo){
        customerRepo = cusRepo;
    }

    @Override
    public List<Customer> loadAllCustomer() {
        System.out.println("service layer");
        return customerRepo.findAll();
    }

}
