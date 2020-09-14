package com.muyi.bank.bankapi.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel(description = "Class representing an Account")
public class Account {

    Long id;
    @ApiModelProperty(example = "0012345653", position = 1)
    String accountNumber;
    @ApiModelProperty(example = "Savings", position = 2)
    String accountType;
    @ApiModelProperty(example = "0.00", position = 3)
    BigDecimal balance;
    @ApiModelProperty(example = "1", position = 4)
    Long accountHolderId;
    @ApiModelProperty(position = 5)
    LocalDateTime created;
    @ApiModelProperty(position = 6)
    LocalDateTime updated;

    public Account() {
    }

    public Account(Long id, String accountNumber, String accountType, BigDecimal balance,
                   Long accountHolderId, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.accountHolderId = accountHolderId;
        this.created = created;
        this.updated = updated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getAccountHolderId() {
        return accountHolderId;
    }

    public void setAccountHolderId(Long accountHolderId) {
        this.accountHolderId = accountHolderId;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
