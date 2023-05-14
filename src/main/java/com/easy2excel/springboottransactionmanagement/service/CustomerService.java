package com.easy2excel.springboottransactionmanagement.service;

import com.easy2excel.springboottransactionmanagement.dto.CustomerDTO;
import com.easy2excel.springboottransactionmanagement.entity.Address;
import com.easy2excel.springboottransactionmanagement.entity.Customer;
import com.easy2excel.springboottransactionmanagement.repository.AddressRepository;
import com.easy2excel.springboottransactionmanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService{

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    AddressRepository addressRepository;


@Transactional
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setName(customerDTO.getCustomerName());
        customer.setUrl(customerDTO.getWebsite());
        Customer dbCustomer = customerRepository.save(customer);
        Address address = null;
        address.setArea(customerDTO.getArea());
        address.setCity(customerDTO.getCity());
        address.setCountry(customerDTO.getCountry());
        address.setPinCode(customerDTO.getPinCode());
        address.setCustomer(dbCustomer);
        Address dbAddress = addressRepository.save(address);

        return "customer saved successfully : "+ dbCustomer.getId();
    }
}
