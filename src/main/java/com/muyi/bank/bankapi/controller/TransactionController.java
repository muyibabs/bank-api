package com.muyi.bank.bankapi.controller;

import com.muyi.bank.bankapi.model.Transaction;
import com.muyi.bank.bankapi.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable Long id){
        return service.getTransactionById(id);
    }

    @GetMapping
    public List<Transaction> getAllTransactions(){
        return service.getAllTransactions();
    }

    @PostMapping
    public Transaction saveTransaction(@RequestBody Transaction trans){
        return service.saveTransaction(trans);
    }

    @DeleteMapping("/{id}")
    public void deleteTransactionById(@PathVariable Long id){
        service.deleteTransactionById(id);
    }
}
