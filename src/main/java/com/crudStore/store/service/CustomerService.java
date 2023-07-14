package com.crudStore.store.service;

import com.crudStore.store.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> loadAllCustomer();

    String saveCustomer(Customer customer);
}
