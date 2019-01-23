package com.org.account.mapper;

import com.org.account.model.EmailCaptcha;

public interface EmailCaptchaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmailCaptcha record);

    int insertSelective(EmailCaptcha record);

    EmailCaptcha selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmailCaptcha record);

    int updateByPrimaryKey(EmailCaptcha record);
}