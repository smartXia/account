package com.org.account.controller;

import com.org.account.domain.User;
import com.org.account.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class SampleController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUserList() {
        //  map.addAttribute("userList", userService.findAll());
        List<User> userList = userService.findAll();
        return userList;
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User postUser(@ModelAttribute @Valid User user) {
        userService.insertByUser(user);
        return userService.insertByUser(user);
    }

}
