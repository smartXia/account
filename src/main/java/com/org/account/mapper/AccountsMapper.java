package com.org.account.mapper;

import com.org.account.model.Accounts;

public interface AccountsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Accounts record);

    int insertSelective(Accounts record);

    Accounts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Accounts record);

    int updateByPrimaryKey(Accounts record);
}