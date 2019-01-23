package com.org.account.mapper;

import com.org.account.model.SessionGroup;

public interface SessionGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SessionGroup record);

    int insertSelective(SessionGroup record);

    SessionGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SessionGroup record);

    int updateByPrimaryKey(SessionGroup record);
}