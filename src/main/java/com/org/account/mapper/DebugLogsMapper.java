package com.org.account.mapper;

import com.org.account.model.DebugLogs;

public interface DebugLogsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DebugLogs record);

    int insertSelective(DebugLogs record);

    DebugLogs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DebugLogs record);

    int updateByPrimaryKey(DebugLogs record);
}