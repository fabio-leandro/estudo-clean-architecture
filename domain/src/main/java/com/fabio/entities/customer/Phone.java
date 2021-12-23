package com.fabio.entities.customer;

import java.util.Objects;

public class Phone {

    private Long id;
    private PhoneType phoneType;
    private String number;

    public Phone(Long id, PhoneType phoneType, String number) {
        this.id = id;
        this.phoneType = phoneType;
        this.number = number;
    }

    public Phone() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(id, phone.id) && phoneType == phone.phoneType && Objects.equals(number, phone.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneType, number);
    }

}
