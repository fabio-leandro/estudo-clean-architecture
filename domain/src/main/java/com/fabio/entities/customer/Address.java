package com.fabio.entities.customer;

import java.util.Objects;

public class Address {

    private Long id;
    private String cep;
    private String street;
    private String complement;
    private String neighbor;
    private String city;
    private String uf;

    public Address(Long id, String cep, String street, String complement, String neighbor, String city, String uf) {
        this.id = id;
        this.cep = cep;
        this.street = street;
        this.complement = complement;
        this.neighbor = neighbor;
        this.city = city;
        this.uf = uf;
    }

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(cep, address.cep) && Objects.equals(street, address.street) && Objects.equals(complement, address.complement) && Objects.equals(neighbor, address.neighbor) && Objects.equals(city, address.city) && Objects.equals(uf, address.uf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cep, street, complement, neighbor, city, uf);
    }
}
