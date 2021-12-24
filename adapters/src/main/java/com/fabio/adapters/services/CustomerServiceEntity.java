package com.fabio.adapters.services;

import com.fabio.adapters.entities.CustomerEntity;
import com.fabio.adapters.repository.CustomerRepositoryJPA;
import com.fabio.entities.customer.Customer;
import com.fabio.ports.customer.CustomerRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceEntity implements CustomerRepositoryPort {

    @Autowired
    CustomerRepositoryJPA customerRepositoryJPA;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public Customer save(Customer customer) {
        CustomerEntity customerEntity = customerRepositoryJPA.save(modelMapper.map(customer, CustomerEntity.class));
        return modelMapper.map(customerEntity, Customer.class);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Customer> findByCpf(String cpf) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Customer updateById(Customer customer, Long id) {
        return null;
    }
}
