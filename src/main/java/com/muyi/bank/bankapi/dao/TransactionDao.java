package com.muyi.bank.bankapi.dao;

import com.muyi.bank.bankapi.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDao extends JpaRepository<Transaction, Long> {

}
