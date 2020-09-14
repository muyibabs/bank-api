package com.muyi.bank.bankapi.dao;

import com.muyi.bank.bankapi.model.entity.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountHolderDao extends JpaRepository<AccountHolder, Long> {
}
