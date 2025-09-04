package com.bowy.design.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 文档
 *
 * @author xiongbw
 */
public class Document {

    private final List<Character> characters = new ArrayList<>();

    /**
     * 添加字符
     *
     * @param character  字符
     * @param fontFamily 字体族
     * @param x          横坐标
     * @param y          纵坐标
     * @param fontSize   字体大小
     * @param color      颜色
     */
    public void addCharacter(char character, String fontFamily, int x, int y, int fontSize, String color) {
        Character charObj = new Character(character, fontFamily, x, y, fontSize, color);
        characters.add(charObj);
    }

    /**
     * 渲染
     */
    public void render() {
        System.out.println("=== 渲染文档 ===");
        for (Character character : characters) {
            character.print();
        }
        System.out.println("===============\n");
    }

    /**
     * 统计字符数量
     *
     * @return 字符数量
     */
    public int countCharacters() {
        return characters.size();
    }

}