package com.muyi.bank.bankapi.service.impl;

import com.muyi.bank.bankapi.dao.AccountHolderDao;
import com.muyi.bank.bankapi.model.AccountHolder;
import com.muyi.bank.bankapi.service.AccountHolderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountHolderServiceImpl implements AccountHolderService {

    private AccountHolderDao holderDao;
    private ModelMapper modelMapper;

    @Autowired
    public AccountHolderServiceImpl(AccountHolderDao holderDao, ModelMapper modelMapper) {
        this.holderDao = holderDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public AccountHolder getAccountHolderById(Long id) {
        Optional<com.muyi.bank.bankapi.model.entity.AccountHolder> holderOptional = holderDao.findById(id);
        if(holderOptional.isPresent())
            return modelMapper.map(holderOptional.get(), AccountHolder.class);
        
        return null;
    }

    @Override
    public List<AccountHolder> getAllAccountHolders() {
        List<com.muyi.bank.bankapi.model.entity.AccountHolder> all = holderDao.findAll();
        return all.isEmpty()?
                null:
                all.stream().map(accountHolder -> modelMapper.map(accountHolder, AccountHolder.class))
                        .collect(Collectors.toList());
    }

    @Override
    public AccountHolder saveAccountHolder(AccountHolder accountHolder) {
        com.muyi.bank.bankapi.model.entity.AccountHolder holder = modelMapper.map(accountHolder, com.muyi.bank.bankapi.model.entity.AccountHolder.class);
        holder = holderDao.save(holder);
        return modelMapper.map(holder, AccountHolder.class);

    }

    @Override
    public void deleteAccountHolderById(Long id) {
        Optional<com.muyi.bank.bankapi.model.entity.AccountHolder> optional = holderDao.findById(id);
        if(optional.isPresent())
            holderDao.delete(optional.get());

    }
}
