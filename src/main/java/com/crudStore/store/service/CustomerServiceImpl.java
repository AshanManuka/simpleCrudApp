package com.crudStore.store.service;

import com.crudStore.store.dao.CustomerDao;
import com.crudStore.store.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;



    @Override
    public List<Customer> loadAllCustomer() {
        return null;
    }
}
