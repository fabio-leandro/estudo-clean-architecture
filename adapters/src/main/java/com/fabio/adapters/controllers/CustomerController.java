package com.fabio.adapters.controllers;

import com.fabio.adapters.dtos.CustomerEntityDTO;
import com.fabio.entities.customer.Customer;
import com.fabio.ports.customer.CustomerServicePort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
                CustomerEntityDTO customerEntityDtoSaved = modelMapper.map(customer,CustomerEntityDTO.class);
                return ResponseEntity.status(HttpStatus.CREATED).body(customerEntityDtoSaved);
        }

        @GetMapping
        @ResponseStatus(HttpStatus.OK)
        public List<CustomerEntityDTO> findAll(){
               List<Customer> customerList = customerServicePort.findAll();
            return customerList.stream().map(customer -> modelMapper.map(customer,CustomerEntityDTO.class))
                    .collect(Collectors.toList());
        }

        @GetMapping("/id/{id}")
        public ResponseEntity<Optional<CustomerEntityDTO>> findById(@PathVariable Long id){
            Optional<Customer> customer = customerServicePort.findById(id);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(customer.map(c->modelMapper.map(c,CustomerEntityDTO.class)));
        }

        @GetMapping("/cpf/{cpf}")
        public ResponseEntity<Optional<CustomerEntityDTO>> findByCpf(@PathVariable String cpf){
            Optional<Customer> customer = customerServicePort.findByCpf(cpf);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(customer.map(c -> modelMapper.map(c,CustomerEntityDTO.class)));
        }

}
