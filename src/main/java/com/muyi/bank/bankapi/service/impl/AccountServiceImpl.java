package com.muyi.bank.bankapi.service.impl;

import com.muyi.bank.bankapi.dao.AccountDao;
import com.muyi.bank.bankapi.model.Account;
import com.muyi.bank.bankapi.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    private ModelMapper modelMapper;

    @Autowired
    public AccountServiceImpl(AccountDao accountDao, ModelMapper modelMapper) {
        this.accountDao = accountDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public Account getAccountById(Long id) {
        Optional<com.muyi.bank.bankapi.model.entity.Account> optional = accountDao.findById(id);
        if(optional.isPresent())
            return modelMapper.map(optional.get(), Account.class);

        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        List<com.muyi.bank.bankapi.model.entity.Account> all = accountDao.findAll();
        if(all.isEmpty())
            return null;
        return all.stream().map(account -> modelMapper.map(account, Account.class))
                .collect(Collectors.toList());
    }

    @Override
    public Account saveAccount(Account account) {
        com.muyi.bank.bankapi.model.entity.Account account1 = modelMapper.map(account, com.muyi.bank.bankapi.model.entity.Account.class);
        account1 = accountDao.save(account1);
        return modelMapper.map(account1, Account.class);
    }

    @Override
    public void deleteAccountById(Long id) {
        Optional<com.muyi.bank.bankapi.model.entity.Account> optional = accountDao.findById(id);
        if(optional.isPresent())
            accountDao.delete(optional.get());
    }
}
