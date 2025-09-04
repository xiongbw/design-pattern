package com.bowy.design.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 字符工厂
 *
 * @author xiongbw
 * @implNote 享元工厂：负责创建和管理享元对象，通过缓存（如 `Map`）确保相同内部状态的对象只创建一次，实现复用。
 */
public class CharacterFactory {

    private static final Map<String, CharacterFlyweight> CHARACTER_CACHE = new ConcurrentHashMap<>();

    /**
     * 获取字符享元对象
     *
     * @param character  字符
     * @param fontFamily 字体族
     * @return 字符享元对象
     */
    public static CharacterFlyweight getCharacter(char character, String fontFamily) {
        String key = character + "_" + fontFamily;

        CharacterFlyweight flyweight = CHARACTER_CACHE.get(key);
        if (flyweight != null) {
            System.out.println("复用现有享元对象: 字符 '" + character + "' 字体 '" + fontFamily + "'");
            return flyweight;
        }

        flyweight = new ConcreteCharacter(character, fontFamily);
        CHARACTER_CACHE.putIfAbsent(key, flyweight);
        return flyweight;
    }

    /**
     * 统计缓存字符的数量
     *
     * @return 缓存字符的数量
     */
    public static int countCacheCharacters() {
        return CHARACTER_CACHE.size();
    }

    /**
     * 打印享元池状态
     */
    public static void printFlyweightPool() {
        System.out.println("=== 享元池状态 ===");
        System.out.println("池中对象数量: " + countCacheCharacters());
        for (String key : CHARACTER_CACHE.keySet()) {
            System.out.println("Key: " + key);
        }
        System.out.println("==================\n");
    }

}
