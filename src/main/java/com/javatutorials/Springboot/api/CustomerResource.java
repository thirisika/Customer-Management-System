package com.javatutorials.Springboot.api;

import com.javatutorials.Springboot.model.Customer;
import com.javatutorials.Springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")

public class CustomerResource {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public Customer addcustomer(@RequestBody Customer customer){
        return  customerService.addcustomer(customer);
    }
    @GetMapping
    public List<Customer>  getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(value = "/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int  customerId){
        return customerService.getCustomer(customerId);

    }
    @PutMapping(value = "/{customerId}")
    public Customer UpdateCustomer(@PathVariable("customerId")  int customerId, @RequestBody Customer customer)
    {
        return customerService.updateCustomer(customerId,customer);
    }

    @DeleteMapping(value = "/{customerId}")
    public void deleteCustomer(@PathVariable("customerId")  int customerId)
    {
        customerService.deleteCustomer(customerId);
    }
}
