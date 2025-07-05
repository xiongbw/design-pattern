package com.bowy.design.prototype;

import com.bowy.design.prototype.model.Address;
import com.bowy.design.prototype.model.User;

/**
 * 原型模式应用
 *
 * @author xiongbw
 */
public class PrototypePatternApplication {

    public static void main(String[] args) {
        shallowCopy();
    }

    /**
     * 浅拷贝
     */
    private static void shallowCopy() {
        // 创建原型对象
        Address address = new Address("深圳", "粤海街道");
        User user = new User();
        user.setAge(18);
        user.setName("Bob");
        user.setAddress(address);
        System.out.println(user);

        // 克隆对象
        User clonedUser = user.clone();
        System.out.println(clonedUser);

        // 修改原始对象字段信息
        user.setAge(19);
        user.setName("Jack");
        user.getAddress().setStreet("南山街道");

        System.out.println(user);
        System.out.println(clonedUser);
    }

}
