package com.demo.mybatis2.service;

import com.demo.mybatis2.beans.Account;
import com.demo.mybatis2.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;
    
    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }
    
}
