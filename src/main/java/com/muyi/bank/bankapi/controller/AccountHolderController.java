package com.muyi.bank.bankapi.controller;

import com.muyi.bank.bankapi.model.AccountHolder;
import com.muyi.bank.bankapi.service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/accountholders")
public class AccountHolderController {

    private AccountHolderService service;

    @Autowired
    public AccountHolderController(AccountHolderService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public AccountHolder getById(@PathVariable(name = "id") Long id){
        return service.getAccountHolderById(id);
    }

    @GetMapping()
    public List<AccountHolder> getAll(){
        return service.getAllAccountHolders();
    }

    @PostMapping
    public AccountHolder saveAcct(@RequestBody AccountHolder accountHolder){
        accountHolder.setCreated(LocalDateTime.now());
        accountHolder.setUpdated(LocalDateTime.now());
        return service.saveAccountHolder(accountHolder);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id){
        service.deleteAccountHolderById(id);
    }

}
