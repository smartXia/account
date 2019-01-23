package com.org.account.mapper;

import com.org.account.model.AppParam;

public interface AppParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppParam record);

    int insertSelective(AppParam record);

    AppParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppParam record);

    int updateByPrimaryKeyWithBLOBs(AppParam record);

    int updateByPrimaryKey(AppParam record);
}