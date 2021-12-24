package com.fabio.adapters.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntityDTO {

    private Long id;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String cpf;
    private AddressEntityDTO address;
    private List<PhoneEntityDTO> phones;

}
