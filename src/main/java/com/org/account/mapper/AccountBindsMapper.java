package com.org.account.mapper;

import com.org.account.model.AccountBinds;

public interface AccountBindsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountBinds record);

    int insertSelective(AccountBinds record);

    AccountBinds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountBinds record);

    int updateByPrimaryKey(AccountBinds record);
}