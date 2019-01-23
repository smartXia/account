package com.org.account.mapper;

import com.org.account.po.PhoneCaptchas;
import com.org.account.po.PhoneCaptchasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneCaptchasMapper {
    long countByExample(PhoneCaptchasExample example);

    int deleteByExample(PhoneCaptchasExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhoneCaptchas record);

    int insertSelective(PhoneCaptchas record);

    List<PhoneCaptchas> selectByExample(PhoneCaptchasExample example);

    PhoneCaptchas selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PhoneCaptchas record, @Param("example") PhoneCaptchasExample example);

    int updateByExample(@Param("record") PhoneCaptchas record, @Param("example") PhoneCaptchasExample example);

    int updateByPrimaryKeySelective(PhoneCaptchas record);

    int updateByPrimaryKey(PhoneCaptchas record);
}