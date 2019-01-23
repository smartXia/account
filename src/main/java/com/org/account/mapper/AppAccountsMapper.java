package com.org.account.mapper;

import com.org.account.po.AppAccounts;
import com.org.account.po.AppAccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppAccountsMapper {
    long countByExample(AppAccountsExample example);

    int deleteByExample(AppAccountsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppAccounts record);

    int insertSelective(AppAccounts record);

    List<AppAccounts> selectByExample(AppAccountsExample example);

    AppAccounts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppAccounts record, @Param("example") AppAccountsExample example);

    int updateByExample(@Param("record") AppAccounts record, @Param("example") AppAccountsExample example);

    int updateByPrimaryKeySelective(AppAccounts record);

    int updateByPrimaryKey(AppAccounts record);
}