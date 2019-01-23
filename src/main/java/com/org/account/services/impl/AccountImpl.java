package com.org.account.services.impl;

import com.org.account.mapper.AccountsMapper;
import com.org.account.model.Accounts;
import com.org.account.model.AccountsExample;
import com.org.account.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountImpl implements AccountService {
    @Autowired
    AccountsMapper accountsMapper;

    @Override
    public List<Accounts> accountList() {
        AccountsExample example = new AccountsExample();
        return accountsMapper.selectByExample(example);
    }

    @Override
    public int addAccount(Accounts accounts) {

        return accountsMapper.insert(accounts);
    }

    @Override
    public int delAccount(Accounts accounts) {
        return accountsMapper.deleteByPrimaryKey(accounts.getId());
    }

    @Override
    public int updateAccount(Accounts accounts) {
        return accountsMapper.updateByPrimaryKeySelective(accounts);
    }
}
