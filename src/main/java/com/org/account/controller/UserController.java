package com.org.account.controller;

import com.org.account.po.User;
import com.org.account.services.UserService;
import com.org.account.services.impl.UserServiceImpl;
import com.org.account.util.Result;
import com.org.account.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * Created by Administrator on 2017/8/16.
 * Springboot全局异常统一处理
 */
@Controller
@Validated//验证服务注解
@RestController//springboot json 返回注解
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public Result addUser(@Validated User user, BindingResult bindingResult) {
        LOGGER.info("新增用户：" + user.getName());
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(userService.addUser(user));
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})

    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {

        return ResultUtil.success(userService.findAllUser(pageNum, pageSize));
    }
}

