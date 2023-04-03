package com.ejemplo.demo.controllers;

import com.ejemplo.demo.entities.Customers;
import com.ejemplo.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("/customer")
    public List<Customers> getCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customers getCustomerById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping("/customer/add")
    public Customers addCustomer(@RequestBody Customers customer) {
        LOGGER.info("Adding customer: {}", customer);
        return customerService.addCustomer(customer);
    }

    @PutMapping("/customer/update")
    public Customers updateCustomer(@RequestBody Customers customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }
}
