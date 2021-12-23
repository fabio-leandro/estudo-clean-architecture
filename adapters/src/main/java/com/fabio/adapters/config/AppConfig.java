package com.fabio.adapters.config;

import com.fabio.adapters.BankApplication;
import com.fabio.services.CustomerServiceImpl;
import com.fabio.ports.customer.CustomerRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BankApplication.class )
public class AppConfig {

    @Bean
    CustomerServiceImpl customerServiceImpl(CustomerRepositoryPort customerRepositoryPort) {
        return new CustomerServiceImpl(customerRepositoryPort);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


}
