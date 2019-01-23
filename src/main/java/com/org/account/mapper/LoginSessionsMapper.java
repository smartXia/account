package com.org.account.mapper;

import com.org.account.model.LoginSessions;

public interface LoginSessionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginSessions record);

    int insertSelective(LoginSessions record);

    LoginSessions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginSessions record);

    int updateByPrimaryKeyWithBLOBs(LoginSessions record);

    int updateByPrimaryKey(LoginSessions record);
}