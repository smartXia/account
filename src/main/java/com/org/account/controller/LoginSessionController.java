package com.org.account.controller;

import com.org.account.po.Accounts;
import com.org.account.services.AccountService;
import com.org.account.services.LoginSessionService;
import com.org.account.util.MD5Utils;
import com.org.account.util.Result;
import com.org.account.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@Validated//验证服务注解
@RestController//springboot json 返回注解
@RequestMapping(value = "/login")
public class LoginSessionController {
    @Autowired
    LoginSessionService loginSessionService;
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/phone", produces = {"application/json;charset=UTF-8"})
    public Result login(@Validated Accounts accounts, BindingResult bindingResult) {
        //参数检测
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(-1, -1, bindingResult.getFieldError().getDefaultMessage());
        }
        List<Accounts> accountsList = accountService.getByPhoneAndChannel(accounts.getAppkey(), accounts.getChannel(), accounts.getPhone());
        if (accountsList == null && accountsList.size() == 0) {
            return ResultUtil.error(-1, -2, "账户信息未注册");
        }
        Accounts accountDetail = accountsList.get(0);
        System.out.println(accountDetail.getPassword());
        if (!accountDetail.getPassword().equals(MD5Utils.encrypt(accounts.getPassword()))) {
            return ResultUtil.error(-1, -3, "密码错误，请重新输入");
        }

        return ResultUtil.success();

    }
}
