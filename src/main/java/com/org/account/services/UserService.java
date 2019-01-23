package com.org.account.services;

import com.org.account.domain.User;

import java.util.List;

public interface UserService {
    /**
     * User 业务层接口
     * <p>
     * Created by bysocket on 24/07/2017.
     */

    List<User> findAll();

    User insertByUser(User user);

    User update(User user);

    User delete(Long id);

    User findById(Long id);
}
