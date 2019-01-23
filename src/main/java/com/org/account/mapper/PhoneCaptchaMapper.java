package com.org.account.mapper;

import com.org.account.model.PhoneCaptcha;

public interface PhoneCaptchaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhoneCaptcha record);

    int insertSelective(PhoneCaptcha record);

    PhoneCaptcha selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhoneCaptcha record);

    int updateByPrimaryKey(PhoneCaptcha record);
}