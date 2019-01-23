package com.org.account.mapper;

import com.org.account.model.AppAccounts;

public interface AppAccountsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppAccounts record);

    int insertSelective(AppAccounts record);

    AppAccounts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppAccounts record);

    int updateByPrimaryKey(AppAccounts record);
}