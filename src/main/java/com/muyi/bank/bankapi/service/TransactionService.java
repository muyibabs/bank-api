package com.muyi.bank.bankapi.service;

import com.muyi.bank.bankapi.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction getTransactionById(Long id);
    List<Transaction> getAllTransactions();
    Transaction saveTransaction(Transaction transaction);
    void deleteTransactionById(Long id);
}
