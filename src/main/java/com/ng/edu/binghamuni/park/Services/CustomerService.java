package com.ng.edu.binghamuni.park.Services;


import com.ng.edu.binghamuni.park.Domain.CustomerInformation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
CustomerInformation saveCustomer(CustomerInformation customer);
    long getTotalWebAddSourceCount();
    long getTotalNewspaperSourceCount();
    long getTotalWordOfMouthSourceCount();

CustomerInformation getCustomerbyId(long id);
List<CustomerInformation> getAllCustomer();
CustomerInformation updateCustomer(CustomerInformation customerInformation);
void deleteCustomer(long id);



}
