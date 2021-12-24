package com.fabio.adapters.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntityDTO {

    private Long id;
    private String cep;
    private String street;
    private String complement;
    private String number;
    private String neighbor;
    private String city;
    private String uf;
}
