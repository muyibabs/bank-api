package com.muyi.bank.bankapi.controller;

import com.muyi.bank.bankapi.model.Account;
import com.muyi.bank.bankapi.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id){
        return service.getAccountById(id);
    }

    @GetMapping
    public List<Account> getAllAccounts(){
        return service.getAllAccounts();
    }

    @PostMapping
    public Account saveAccount(@RequestBody Account account){
        return service.saveAccount(account);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteAccountById(id);
    }
}
