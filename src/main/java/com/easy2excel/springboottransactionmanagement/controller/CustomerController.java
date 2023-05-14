package com.easy2excel.springboottransactionmanagement.controller;

import com.easy2excel.springboottransactionmanagement.dto.CustomerDTO;
import com.easy2excel.springboottransactionmanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/saveCustomer")
    public ResponseEntity<String> saveCustomer(@RequestBody CustomerDTO customer) {
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }




}
