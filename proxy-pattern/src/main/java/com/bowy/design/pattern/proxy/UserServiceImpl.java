package com.bowy.design.pattern.proxy;

/**
 * 实现目标类
 *
 * @author xiongbw
 */
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(String username) {
        System.out.printf("User %s saved%n", username);
    }

}
