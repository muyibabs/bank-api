package com.muyi.bank.bankapi.model;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

public class Transaction {

    Long id;
    @ApiModelProperty(example = "Debit", position = 1)
    String type;
    @ApiModelProperty(example = "TR1005678", position = 2)
    String referenceNumber;
    @ApiModelProperty(example = "Cash deposit by self", position = 3)
    String description;
    @ApiModelProperty(example = "Peachtree Corner", position = 4)
    String location;
    @ApiModelProperty(example = "1", position = 5)
    Long accountId;
    @ApiModelProperty(position = 6)
    LocalDateTime created;
    @ApiModelProperty(position = 7)
    LocalDateTime updated;

    public Transaction() {
    }

    public Transaction(Long id, String type, String referenceNumber, String description,
                       String location, Long accountId, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.type = type;
        this.referenceNumber = referenceNumber;
        this.description = description;
        this.location = location;
        this.accountId = accountId;
        this.created = created;
        this.updated = updated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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
