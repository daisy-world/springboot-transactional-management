package com.easy2excel.springboottransactionmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootTransactionManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTransactionManagementApplication.class, args);
    }

}
