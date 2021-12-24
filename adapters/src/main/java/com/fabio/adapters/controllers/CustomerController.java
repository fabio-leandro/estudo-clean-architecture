package com.fabio.adapters.controllers;

import com.fabio.adapters.consumers.ConsumerCep;
import com.fabio.adapters.dtos.CustomerEntityDTO;
import com.fabio.entities.customer.Customer;
import com.fabio.ports.customer.CustomerServicePort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/bank/customers")
public class CustomerController {

        @Autowired
        CustomerServicePort customerServicePort;

        @Autowired
        ModelMapper modelMapper;

        @PostMapping
        public ResponseEntity<CustomerEntityDTO> save(@RequestBody CustomerEntityDTO customerEntityDTO){
                Customer customer = customerServicePort.save(modelMapper.map(customerEntityDTO,Customer.class));
                CustomerEntityDTO customerEntityDTOsaved = modelMapper.map(customer,CustomerEntityDTO.class);
                return ResponseEntity.status(HttpStatus.CREATED).body(customerEntityDTOsaved);
        }

}
