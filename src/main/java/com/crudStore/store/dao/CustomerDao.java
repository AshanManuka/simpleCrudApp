package com.crudStore.store.dao;

import com.crudStore.store.entity.Customer;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface CustomerDao {

    List<Customer> loadAllCustomers();
}
