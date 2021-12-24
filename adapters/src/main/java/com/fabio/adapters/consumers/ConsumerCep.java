package com.fabio.adapters.consumers;

import com.fabio.adapters.dtos.AddressEntityDTO;
import com.fabio.adapters.entities.AddressConsumer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumerCep {

    public Object consumerCepApi(String cep){

        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        ResponseEntity<AddressConsumer> address =
                restTemplate.getForEntity("https://viacep.com.br/ws/"+cep+"/json/", AddressConsumer.class);

        return address;

    }

}
