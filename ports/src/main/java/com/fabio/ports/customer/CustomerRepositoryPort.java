package com.fabio.ports.customer;


import com.fabio.entities.customer.Customer;


import java.util.List;
import java.util.Optional;

public interface CustomerRepositoryPort {

    Customer save(Customer customer);
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    Optional<Customer> findByCpf(String cpf);
    void deleteById(Long id);
    Customer updateById(Customer customer, Long id);

}
