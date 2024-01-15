package com.ng.edu.binghamuni.park.Services;

import com.ng.edu.binghamuni.park.Domain.CustomerInformation;
import com.ng.edu.binghamuni.park.Repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplementation implements FormService{
@Autowired
    FormRepository customerRepository;

    @Override
    public CustomerInformation saveCustomer(CustomerInformation customer) {
        return customerRepository.save(customer);
    }

    @Override
    public long getTotalWebAddSourceCount() {
        return customerRepository.countByadSource("Web");
    }

    @Override
    public long getTotalNewspaperSourceCount() {
        return customerRepository.countByadSource("Newspaper");
    }

    @Override
    public long getTotalWordOfMouthSourceCount() {
        return customerRepository.countByadSource("WordOfMouth");
    }

@Override
    public long getTotalCustomers(){
        return customerRepository.count();
    }
    @Override
    public CustomerInformation getCustomerbyId(long id) {
        Optional<CustomerInformation> customer = customerRepository.findById(id);
        CustomerInformation knownCustomer;
        if(customer.isPresent()){
            knownCustomer = customer.get();
            return knownCustomer;
        }else {
            throw new RuntimeException("Customer not found");
        }
    }

    @Override
    public List<CustomerInformation> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public CustomerInformation updateCustomer(CustomerInformation customerInformation) {
        Optional<CustomerInformation> customerInformation1 = customerRepository.findById(customerInformation.getId());
        CustomerInformation customer = new CustomerInformation();
        if(customerInformation1.isPresent()){
            customer.setName(customer.getName());
            customer.setAddress(customer.getAddress());
            customer.setEmail(customer.getEmail());
            customer.setPhone(customer.getPhone());
            customer.setId(customer.getId());
        }
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }
}
