package com.fabio.adapters.repository;


import com.fabio.adapters.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepositoryJPA extends JpaRepository<CustomerEntity, Long> {

    Optional<CustomerEntity> findByCpf(String cpf);

}
