package com.org.account.services.impl;

import com.org.account.mapper.AccountsMapper;
import com.org.account.po.Accounts;
import com.org.account.po.AccountsExample;
import com.org.account.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountImpl implements AccountService {
    @Autowired
    AccountsMapper accountsMapper;

    @Override
    public List<Accounts> accountList(Accounts accounts) {
        //传过来的是account对象包含值
        AccountsExample example = new AccountsExample();


        return accountsMapper.selectByExample(example);
    }

    @Override
    public List<Accounts> getByPhoneAndChannel(String appkey, int channel, String phone) {
        AccountsExample example = new AccountsExample();
        example.or().andChannelEqualTo(channel).andPhoneEqualTo(phone).andAppkeyEqualTo(appkey);
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
