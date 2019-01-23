package com.org.account.mapper;

import com.org.account.model.EmailCaptcha;
import com.org.account.model.EmailCaptchaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailCaptchaMapper {
    long countByExample(EmailCaptchaExample example);

    int deleteByExample(EmailCaptchaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmailCaptcha record);

    int insertSelective(EmailCaptcha record);

    List<EmailCaptcha> selectByExample(EmailCaptchaExample example);

    EmailCaptcha selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmailCaptcha record, @Param("example") EmailCaptchaExample example);

    int updateByExample(@Param("record") EmailCaptcha record, @Param("example") EmailCaptchaExample example);

    int updateByPrimaryKeySelective(EmailCaptcha record);

    int updateByPrimaryKey(EmailCaptcha record);
}