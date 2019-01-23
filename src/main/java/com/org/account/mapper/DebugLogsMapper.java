package com.org.account.mapper;

import com.org.account.po.DebugLogs;
import com.org.account.po.DebugLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DebugLogsMapper {
    long countByExample(DebugLogsExample example);

    int deleteByExample(DebugLogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DebugLogs record);

    int insertSelective(DebugLogs record);

    List<DebugLogs> selectByExample(DebugLogsExample example);

    DebugLogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DebugLogs record, @Param("example") DebugLogsExample example);

    int updateByExample(@Param("record") DebugLogs record, @Param("example") DebugLogsExample example);

    int updateByPrimaryKeySelective(DebugLogs record);

    int updateByPrimaryKey(DebugLogs record);
}