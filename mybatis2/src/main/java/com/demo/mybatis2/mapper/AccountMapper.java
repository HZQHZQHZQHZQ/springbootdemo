package com.demo.mybatis2.mapper;

import com.demo.mybatis2.beans.Account;

import java.util.List;

public interface AccountMapper {

    List<Account> findAccountList();
    
}
