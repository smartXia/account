package com.org.account.services;

import com.org.account.po.Accounts;
import org.apache.ibatis.annotations.SelectProvider;

import java.nio.channels.AcceptPendingException;
import java.util.List;

public interface IUser {
    @SelectProvider(type = Accounts.class,method = "addUser" )
    List<Object> getById();
}
