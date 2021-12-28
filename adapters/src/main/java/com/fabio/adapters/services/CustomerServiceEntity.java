package com.fabio.adapters.services;

import com.fabio.adapters.entities.CustomerEntity;
import com.fabio.adapters.repository.CustomerRepositoryJPA;
import com.fabio.entities.customer.Customer;
import com.fabio.ports.customer.CustomerRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    public List<Customer> findAll() {
        List<CustomerEntity> customerEntityList = customerRepositoryJPA.findAll();
        List<Customer> customerList = customerEntityList.stream().map(c -> modelMapper.map(c,Customer.class))
                .collect(Collectors.toList());
        return customerList;
    }

    @Override
    public Optional<Customer> findById(Long id)  {
        Optional<CustomerEntity> customerEntity = customerRepositoryJPA.findById(id);
        Customer customerOptional = modelMapper.map(customerEntity,Customer.class);
        return Optional.of(customerOptional);
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
