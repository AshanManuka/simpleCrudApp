package com.crudStore.store.dao;

import com.crudStore.store.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private EntityManager entityManager;

    @Autowired
    public CustomerDaoImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Customer> loadAllCustomers() {
        return null;
    }
}
