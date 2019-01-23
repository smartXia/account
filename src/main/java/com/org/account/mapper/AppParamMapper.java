package com.org.account.mapper;

import com.org.account.po.AppParam;
import com.org.account.po.AppParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppParamMapper {
    long countByExample(AppParamExample example);

    int deleteByExample(AppParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppParam record);

    int insertSelective(AppParam record);

    List<AppParam> selectByExampleWithBLOBs(AppParamExample example);

    List<AppParam> selectByExample(AppParamExample example);

    AppParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppParam record, @Param("example") AppParamExample example);

    int updateByExampleWithBLOBs(@Param("record") AppParam record, @Param("example") AppParamExample example);

    int updateByExample(@Param("record") AppParam record, @Param("example") AppParamExample example);

    int updateByPrimaryKeySelective(AppParam record);

    int updateByPrimaryKeyWithBLOBs(AppParam record);

    int updateByPrimaryKey(AppParam record);
}