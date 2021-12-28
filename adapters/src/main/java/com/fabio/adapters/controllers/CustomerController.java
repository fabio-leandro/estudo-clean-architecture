package com.fabio.adapters.controllers;

import com.fabio.adapters.dtos.CustomerEntityDTO;
import com.fabio.entities.customer.Customer;
import com.fabio.ports.customer.CustomerServicePort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
        public Page<CustomerEntityDTO> findAll(@PageableDefault(size = 3) Pageable pageable){
               List<Customer> customerList = customerServicePort.findAll();
               List<CustomerEntityDTO> customerEntityDTOList =
                       customerList.stream().map(customer -> modelMapper.map(customer,CustomerEntityDTO.class))
                               .collect(Collectors.toList());
               Page<CustomerEntityDTO> page = new PageImpl<>(customerEntityDTOList
                       ,pageable,customerEntityDTOList.size());
               return page;
        }

        @GetMapping("/{id}")
        public ResponseEntity<CustomerEntityDTO> findById(@PathVariable Long id){
            Optional<Customer> customer = customerServicePort.findById(id);
            CustomerEntityDTO customerEntityDTO = modelMapper.map(customer,CustomerEntityDTO.class);
            return ResponseEntity.status(HttpStatus.OK).body(customerEntityDTO);
        }

}
