package com.bowy.design.pattern.proxy.static_;

import com.bowy.design.pattern.proxy.UserService;

/**
 * 实现代理类
 *
 * @author xiongbw
 */
public class UserServiceProxy implements UserService {

    private final UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void saveUser(String username) {
        System.out.printf("【Proxy】Before saving user %s%n", username);
        userService.saveUser(username);
        System.out.printf("【Proxy】After saving user %s%n", username);
    }

}
