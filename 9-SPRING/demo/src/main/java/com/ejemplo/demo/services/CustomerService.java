package com.ejemplo.demo.services;

import com.ejemplo.demo.entities.Customers;
import com.ejemplo.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customers> findAllCustomers(){
        return customerRepository.findAll();
    }

    public Customers findCustomerById(Long id){
        return customerRepository.findById(id).get();
    }

    public Customers addCustomer(Customers customer){
        return customerRepository.save(customer);
    }

    public String deleteCustomer(Long id){
        Customers customer = customerRepository.findById(id).get();
        customerRepository.delete(customer);
        return "Cliente eliminado";
    }

    public Customers updateCustomer(Customers customer){
        return customerRepository.save(customer);
    }
}
