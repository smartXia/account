package com.org.account.services;


import com.org.account.po.Accounts;

import java.util.List;

public interface AccountService {
    //添加新的account用户
    int addAccount(Accounts accounts);

    //删除account用户
    int delAccount(Accounts accounts);

    //更新account用户
    int updateAccount(Accounts accounts);

    //account用户列表
    List<Accounts> accountList(Accounts accounts);

    //登录使用的phone +channel查询

    List<Accounts> getByPhoneAndChannel(String appkey, int channel, String phone);
}
