package com.fabio.entities.account;

import com.fabio.entities.customer.Customer;

import java.util.Objects;

public class BankAccount {

    private Long id;
    private String bank;
    private AccountType accountType;
    private String agency;
    private String AccountNumber;
    private Customer customer;
    private AccountStatus accountStatus;

    public BankAccount(Long id, String bank, AccountType accountType, String agency, String accountNumber,
                       Customer customer, AccountStatus accountStatus) {
        this.id = id;
        this.bank = bank;
        this.accountType = accountType;
        this.agency = agency;
        AccountNumber = accountNumber;
        this.customer = customer;
        this.accountStatus = accountStatus;
    }

    public BankAccount() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(id, that.id) && Objects.equals(bank, that.bank) && accountType == that.accountType && Objects.equals(agency, that.agency) && Objects.equals(AccountNumber, that.AccountNumber) && Objects.equals(customer, that.customer) && accountStatus == that.accountStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bank, accountType, agency, AccountNumber, customer, accountStatus);
    }

}
