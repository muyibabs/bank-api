package com.muyi.bank.bankapi.service.impl;

import com.muyi.bank.bankapi.dao.TransactionDao;
import com.muyi.bank.bankapi.model.Transaction;
import com.muyi.bank.bankapi.service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService {

    private TransactionDao transactionDao;
    private ModelMapper modelMapper;

    @Autowired
    public TransactionServiceImpl(TransactionDao transactionDao, ModelMapper modelMapper) {
        this.transactionDao = transactionDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public Transaction getTransactionById(Long id) {
        Optional<com.muyi.bank.bankapi.model.entity.Transaction> optional = transactionDao.findById(id);
        if(optional.isPresent())
            return modelMapper.map(optional.get(), Transaction.class);
        return null;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        List<com.muyi.bank.bankapi.model.entity.Transaction> all = transactionDao.findAll();
        if(!all.isEmpty())
            return all.stream().map(transaction -> modelMapper.map(transaction, Transaction.class))
                    .collect(Collectors.toList());
        return null;
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        com.muyi.bank.bankapi.model.entity.Transaction transaction1 = modelMapper.map(transaction, com.muyi.bank.bankapi.model.entity.Transaction.class);
        transaction1 = transactionDao.save(transaction1);
        return modelMapper.map(transaction1, Transaction.class);
    }

    @Override
    public void deleteTransactionById(Long id) {
        Optional<com.muyi.bank.bankapi.model.entity.Transaction> optional = transactionDao.findById(id);
        if(optional.isPresent())
            transactionDao.delete(optional.get());
    }
}
