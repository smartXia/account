package com.org.account.controller;

import com.org.account.po.Accounts;
import com.org.account.services.AccountService;
import com.org.account.services.impl.UserServiceImpl;
import com.org.account.util.MD5Utils;
import com.org.account.util.Result;
import com.org.account.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * 用于注册用户的基础账户信息
 */
@Controller
@RequestMapping("/account")
@RestController
public class AccountControl {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/register", produces = {"application/json;charset=UTF-8"})
    public Result Register(@Validated Accounts accounts, BindingResult bindingResult) {

        //参数检测
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(-1, -1, bindingResult.getFieldError().getDefaultMessage());
        }
        //检测手机号是否为空  //检测手机是否注册
        List<Accounts> isAccountExist = accountService.getByPhoneAndChannel(accounts.getAppkey(), accounts.getChannel(), accounts.getPhone());
        System.out.print(isAccountExist);
        //检测手机是否注册
        if (isAccountExist != null && isAccountExist.size() != 0) {
            return ResultUtil.error(-1, 208, "手机号已注册");
        } else {
            //生成openid
            accounts.setOpenid(getUUID32());
            LOGGER.info("account：" + accounts.toString());
            String password = accounts.getPassword();
            //加密密码的方法
            accounts.setPassword(MD5Utils.encrypt(password));
            return ResultUtil.success(accountService.addAccount(accounts));
        }
    }


    /**
     * 生成accountID方法
     */
    public static String getUUID32() {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return uuid;
    }

}
