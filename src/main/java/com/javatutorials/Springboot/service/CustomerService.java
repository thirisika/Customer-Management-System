package com.javatutorials.Springboot.service;

import com.javatutorials.Springboot.dao.CustomerDAO;
import com.javatutorials.Springboot.exception.CustomerNotFoundException;
import com.javatutorials.Springboot.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;
    public Customer addcustomer(Customer customer)
    {
        return customerDAO.save(customer);

    }

    public  List<Customer> getCustomers(){

        return customerDAO.findAll();
    }


    public  Customer getCustomer(int customerId){
       Optional<Customer> optionalCustomer =customerDAO.findById(customerId);
       if(!optionalCustomer.isPresent()) {
           throw new CustomerNotFoundException("customer Record is not available...");
       }

        return optionalCustomer.get();
    }

    public  Customer updateCustomer(int customerId,Customer customer)
    {
        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId){
        customerDAO.deleteById(customerId);
    }

}
