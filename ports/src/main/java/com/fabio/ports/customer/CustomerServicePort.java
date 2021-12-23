package com.fabio.ports.customer;

import com.fabio.entities.customer.Customer;

import java.util.Optional;

public interface CustomerServicePort {

    Customer save(Customer customer);
    Optional<Customer> findById(Long id);
    Optional<Customer> findByCpf(String cpf);
    void deleteById(Long id);
    Customer updateById(Customer customer, Long id);
}
