package com.bowy.design.pattern.flyweight;

/**
 * 具体字符
 *
 * @author xiongbw
 * @implNote 具体享元类：实现 {@link ConcreteCharacter 享元}接口，存储可以共享的内部不可变状态，这些状态可被多个对象共用。
 */
public class ConcreteCharacter implements CharacterFlyweight {

    /**
     * 字符
     *
     * @implNote 内部状态
     */
    private final char character;

    /**
     * 字体族
     *
     * @implNote 内部状态
     */
    private final String fontFamily;

    public ConcreteCharacter(char character, String fontFamily) {
        this.character = character;
        this.fontFamily = fontFamily;
        System.out.println("创建享元对象: 字符 '" + character + "' 字体 '" + fontFamily + "'");
    }

    public char getCharacter() {
        return character;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    @Override
    public void print(int x, int y, int fontSize, String color) {
        // 使用内部状态和外部状态进行打印
        System.out.println("渲染字符 '" + character + "' " +
                "字体: " + fontFamily + " " +
                "位置: (" + x + "," + y + ") " +
                "大小: " + fontSize + " " +
                "颜色: " + color);
    }

}