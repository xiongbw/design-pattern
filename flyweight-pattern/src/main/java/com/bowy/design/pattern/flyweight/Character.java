package com.bowy.design.pattern.flyweight;

/**
 * 字符
 *
 * @author xiongbw
 * @implNote 上下文类：维护外部状态
 */
public class Character {

    /**
     * 享元对象引用
     */
    private final CharacterFlyweight flyweight;

    /**
     * 位置：横坐标
     *
     * @implNote 外部状态
     */
    private final int x;

    /**
     * 位置：纵坐标
     *
     * @implNote 外部状态
     */
    private final int y;

    /**
     * 字体大小
     *
     * @implNote 外部状态
     */
    private final int fontSize;

    /**
     * 颜色
     *
     * @implNote 外部状态
     */
    private final String color;

    public Character(char character, String fontFamily, int x, int y, int fontSize, String color) {
        this.flyweight = CharacterFactory.getCharacter(character, fontFamily);
        this.x = x;
        this.y = y;
        this.fontSize = fontSize;
        this.color = color;
    }

    /**
     * 打印
     */
    public void print() {
        flyweight.print(x, y, fontSize, color);
    }

}
