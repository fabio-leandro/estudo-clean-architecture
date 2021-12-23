package com.fabio.entities.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Payments {

    private Long id;
    private BankAccount bankAccount;
    private LocalDate dueDate;
    private LocalDate operationDate;
    private String creditor;
    private String documentNumber;
    private BigDecimal value;
    private OperationType operationType;

    public Payments(Long id, BankAccount bankAccount, LocalDate dueDate, LocalDate operationDate, String creditor,
                    String documentNumber, BigDecimal value, OperationType operationType) {
        this.id = id;
        this.bankAccount = bankAccount;
        this.dueDate = dueDate;
        this.operationDate = operationDate;
        this.creditor = creditor;
        this.documentNumber = documentNumber;
        this.value = value;
        this.operationType = operationType;
    }

    public Payments() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDate operationDate) {
        this.operationDate = operationDate;
    }

    public String getCreditor() {
        return creditor;
    }

    public void setCreditor(String creditor) {
        this.creditor = creditor;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payments payments = (Payments) o;
        return Objects.equals(id, payments.id) && Objects.equals(bankAccount, payments.bankAccount) && Objects.equals(dueDate, payments.dueDate) && Objects.equals(operationDate, payments.operationDate) && Objects.equals(creditor, payments.creditor) && Objects.equals(documentNumber, payments.documentNumber) && Objects.equals(value, payments.value) && Objects.equals(operationType, payments.operationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bankAccount, dueDate, operationDate, creditor, documentNumber, value, operationType);
    }

}
