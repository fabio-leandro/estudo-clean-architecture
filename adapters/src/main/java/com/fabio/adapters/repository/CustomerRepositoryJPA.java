package com.fabio.adapters.repository;


import com.fabio.adapters.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryJPA extends JpaRepository<CustomerEntity, Long> {

}
