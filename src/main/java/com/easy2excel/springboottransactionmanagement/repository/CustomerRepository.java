package com.easy2excel.springboottransactionmanagement.repository;

import com.easy2excel.springboottransactionmanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
