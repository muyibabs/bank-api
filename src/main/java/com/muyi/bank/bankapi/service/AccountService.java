package com.muyi.bank.bankapi.service;

import com.muyi.bank.bankapi.model.Account;

import java.util.List;

public interface AccountService {
    Account getAccountById(Long id);
    List<Account> getAllAccounts();
    Account saveAccount(Account account);
    void deleteAccountById(Long id);
}
