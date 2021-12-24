package com.fabio.adapters.dtos;

import com.fabio.adapters.entities.PhoneTypeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneEntityDTO {

    private Long id;
    private PhoneTypeEntity phoneType;
    private String number;

}
