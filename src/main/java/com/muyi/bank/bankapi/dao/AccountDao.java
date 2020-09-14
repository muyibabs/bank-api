package com.muyi.bank.bankapi.dao;

import com.muyi.bank.bankapi.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {
}
