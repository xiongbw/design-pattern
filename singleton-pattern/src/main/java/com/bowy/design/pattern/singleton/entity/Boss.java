package com.bowy.design.pattern.singleton.entity;

/**
 * 老板
 * <p>
 * 懒汉式单例模式
 *
 * @author xiongbw
 */
public class Boss {

    private static Boss BOSS;

    /**
     * 姓名
     */
    private String name;

    /**
     * 私有化构造方法
     */
    private Boss() {
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
     * @return 老板实例对象
     */
    public synchronized static Boss getInstance() {
        if (BOSS == null) {
            BOSS = new Boss();
        }
        return BOSS;
    }

}
