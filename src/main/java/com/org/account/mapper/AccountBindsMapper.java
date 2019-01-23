package com.org.account.mapper;

import com.org.account.po.AccountBinds;
import com.org.account.po.AccountBindsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountBindsMapper {
    long countByExample(AccountBindsExample example);

    int deleteByExample(AccountBindsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountBinds record);

    int insertSelective(AccountBinds record);

    List<AccountBinds> selectByExample(AccountBindsExample example);

    AccountBinds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountBinds record, @Param("example") AccountBindsExample example);

    int updateByExample(@Param("record") AccountBinds record, @Param("example") AccountBindsExample example);

    int updateByPrimaryKeySelective(AccountBinds record);

    int updateByPrimaryKey(AccountBinds record);
}