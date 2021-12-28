package com.fabio.services;

import com.fabio.entities.customer.Customer;
import com.fabio.ports.customer.CustomerRepositoryPort;
import com.fabio.ports.customer.CustomerServicePort;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerServicePort {

    private CustomerRepositoryPort customerRepositoryPort;

    public CustomerServiceImpl(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepositoryPort.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepositoryPort.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id){
        return customerRepositoryPort.findById(id);
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
