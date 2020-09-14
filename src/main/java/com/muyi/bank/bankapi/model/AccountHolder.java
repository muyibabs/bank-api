package com.muyi.bank.bankapi.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ApiModel(description = "Class representing an AccountHolder")
public class AccountHolder {

    Long id;
    @ApiModelProperty(example = "Jane", position = 1)
    String firstName;
    @ApiModelProperty(example = "Wood", position = 2)
    String lastName;
    @ApiModelProperty(example = "2000-01-01", position = 3)
    LocalDate dateOfBirth;
    @ApiModelProperty(example = "female", position = 4)
    String sex;
    @ApiModelProperty(example = "123 Johns Cr., Duluth GA", position = 5, allowableValues = "female, male")
    String address;
    @ApiModelProperty(position = 6)
    LocalDateTime created;
    @ApiModelProperty(position = 7)
    LocalDateTime updated;

    public AccountHolder() {
    }

    public AccountHolder(Long id, String firstName, String lastName, LocalDate dateOfBirth,
                         String sex, String address, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.address = address;
        this.created = created;
        this.updated = updated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
