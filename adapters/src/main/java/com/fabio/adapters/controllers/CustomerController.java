package com.fabio.adapters.controllers;

import com.fabio.adapters.entities.CustomerEntity;
import com.fabio.ports.customer.CustomerServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/bank/customers")
public class CustomerController {

        @Autowired
        CustomerServicePort customerServicePort;



}
