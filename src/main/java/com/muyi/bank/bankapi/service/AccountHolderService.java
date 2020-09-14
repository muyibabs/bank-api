package com.muyi.bank.bankapi.service;

import com.muyi.bank.bankapi.model.AccountHolder;

import java.util.List;

public interface AccountHolderService {
    AccountHolder getAccountHolderById(Long id);
    List<AccountHolder> getAllAccountHolders();
    AccountHolder saveAccountHolder(AccountHolder accountHolder);
    void deleteAccountHolderById(Long id);
}
