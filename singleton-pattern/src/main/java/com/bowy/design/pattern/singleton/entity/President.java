package com.bowy.design.pattern.singleton.entity;

/**
 * 总统
 * <p>
 * 饿汉式单例模式
 *
 * @author xiongbw
 */
public class President {

    private static final President PRESIDENT = new President();

    /**
     * 姓名
     */
    private String name;

    /**
     * 私有化构造方法
     */
    private President() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 获取实例
     *
     * @return 实例对象
     */
    public static President getInstance() {
        return PRESIDENT;
    }


}
