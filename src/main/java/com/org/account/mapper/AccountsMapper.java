package com.org.account.mapper;

import com.org.account.po.Accounts;
import com.org.account.po.AccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsMapper {
    long countByExample(AccountsExample example);

    int deleteByExample(AccountsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Accounts record);

    int insertSelective(Accounts record);

    List<Accounts> selectByExample(AccountsExample example);

    Accounts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Accounts record, @Param("example") AccountsExample example);

    int updateByExample(@Param("record") Accounts record, @Param("example") AccountsExample example);

    int updateByPrimaryKeySelective(Accounts record);

    int updateByPrimaryKey(Accounts record);
}