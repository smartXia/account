package com.org.account.mapper;

import com.org.account.po.SessionGroup;
import com.org.account.po.SessionGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionGroupMapper {
    long countByExample(SessionGroupExample example);

    int deleteByExample(SessionGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SessionGroup record);

    int insertSelective(SessionGroup record);

    List<SessionGroup> selectByExample(SessionGroupExample example);

    SessionGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SessionGroup record, @Param("example") SessionGroupExample example);

    int updateByExample(@Param("record") SessionGroup record, @Param("example") SessionGroupExample example);

    int updateByPrimaryKeySelective(SessionGroup record);

    int updateByPrimaryKey(SessionGroup record);
}