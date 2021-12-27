package com.fabio.adapters.controllers;

import com.fabio.adapters.consumers.ConsumerCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/bank/addresses")
public class ConsumerAddressController {

    @Autowired
    ConsumerCep consumerCep;

    @GetMapping("/{cep}")
    public ResponseEntity<Object> getAddress(@PathVariable String cep){
        Object address = consumerCep.consumerCepApi(cep);
        return ResponseEntity.status(HttpStatus.OK).body(address);
    }

}
