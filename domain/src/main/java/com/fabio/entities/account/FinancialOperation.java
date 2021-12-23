package com.fabio.entities.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class FinancialOperation {

    private Long id;
    private BankAccount bankAccount;
    private LocalDate operationDate;
    private OperationDescription operationDescription;
    private String observation;
    private BigDecimal value;
    private OperationType operationType;

    public FinancialOperation(Long id, BankAccount bankAccount, LocalDate operationDate,
                              OperationDescription operationDescription, String observation, BigDecimal value,
                              OperationType operationType) {
        this.id = id;
        this.bankAccount = bankAccount;
        this.operationDate = operationDate;
        this.operationDescription = operationDescription;
        this.observation = observation;
        this.value = value;
        this.operationType = operationType;
    }

    public FinancialOperation() {
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

    public LocalDate getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDate operationDate) {
        this.operationDate = operationDate;
    }

    public OperationDescription getOperationDescription() {
        return operationDescription;
    }

    public void setOperationDescription(OperationDescription operationDescription) {
        this.operationDescription = operationDescription;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
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
        FinancialOperation that = (FinancialOperation) o;
        return Objects.equals(id, that.id) && Objects.equals(bankAccount, that.bankAccount) && Objects.equals(operationDate, that.operationDate) && Objects.equals(operationDescription, that.operationDescription) && Objects.equals(observation, that.observation) && Objects.equals(value, that.value) && operationType == that.operationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bankAccount, operationDate, operationDescription, observation, value, operationType);
    }
}
