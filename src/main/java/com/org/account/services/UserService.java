package com.org.account.services;

import com.org.account.po.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

}
