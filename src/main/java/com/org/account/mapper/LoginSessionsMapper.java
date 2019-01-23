package com.org.account.mapper;

import com.org.account.model.LoginSessions;
import com.org.account.model.LoginSessionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginSessionsMapper {
    long countByExample(LoginSessionsExample example);

    int deleteByExample(LoginSessionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoginSessions record);

    int insertSelective(LoginSessions record);

    List<LoginSessions> selectByExampleWithBLOBs(LoginSessionsExample example);

    List<LoginSessions> selectByExample(LoginSessionsExample example);

    LoginSessions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoginSessions record, @Param("example") LoginSessionsExample example);

    int updateByExampleWithBLOBs(@Param("record") LoginSessions record, @Param("example") LoginSessionsExample example);

    int updateByExample(@Param("record") LoginSessions record, @Param("example") LoginSessionsExample example);

    int updateByPrimaryKeySelective(LoginSessions record);

    int updateByPrimaryKeyWithBLOBs(LoginSessions record);

    int updateByPrimaryKey(LoginSessions record);
}