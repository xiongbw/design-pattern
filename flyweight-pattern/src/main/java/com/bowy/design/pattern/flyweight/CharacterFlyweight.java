package com.bowy.design.pattern.flyweight;

/**
 * 字符
 *
 * @author xiongbw
 * @implSpec 享元接口：定义共享对象的接口，通常包含操作外在状态的方法。
 */
public interface CharacterFlyweight {

    /**
     * 打印
     *
     * @param x        横坐标
     * @param y        纵坐标
     * @param fontSize 字体大小
     * @param color    字符颜色
     */
    void print(int x, int y, int fontSize, String color);

}