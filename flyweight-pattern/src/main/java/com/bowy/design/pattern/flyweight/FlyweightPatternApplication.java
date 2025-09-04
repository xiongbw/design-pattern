package com.bowy.design.pattern.flyweight;

/**
 * 享元模式应用
 *
 * @author xiongbw
 */
public class FlyweightPatternApplication {

    public static void main(String[] args) {
        // 创建文档
        Document document = new Document();

        // 添加字符到文档中
        System.out.println("--- 添加字符到文档 ---");

        // 添加 "Hello"
        document.addCharacter('H', "Arial", 0, 0, 12, "black");
        document.addCharacter('e', "Arial", 10, 0, 12, "black");
        document.addCharacter('l', "Arial", 20, 0, 12, "black");
        document.addCharacter('l', "Arial", 30, 0, 12, "black"); // 复用 'l'
        document.addCharacter('o', "Arial", 40, 0, 12, "black");

        // 添加 "World"
        document.addCharacter('W', "Arial", 60, 0, 14, "red");
        document.addCharacter('o', "Arial", 70, 0, 14, "red"); // 复用 'o'，但不同外部状态
        document.addCharacter('r', "Arial", 80, 0, 14, "red");
        document.addCharacter('l', "Arial", 90, 0, 14, "red"); // 复用 'l'
        document.addCharacter('d', "Arial", 100, 0, 14, "red");

        // 添加不同字体的字符
        document.addCharacter('!', "Times", 110, 0, 16, "blue");
        document.addCharacter('H', "Times", 120, 0, 12, "green"); // 不同字体的H，会创建新的享元

        System.out.println();

        // 查看享元池状态
        CharacterFactory.printFlyweightPool();

        // 渲染文档
        document.render();

        // 统计信息
        System.out.println("=== 统计信息 ===");
        System.out.println("文档中字符总数: " + document.countCharacters());
        System.out.println("享元对象数量: " + CharacterFactory.countCacheCharacters());
        System.out.println("内存节省率: " +
                String.format("%.1f%%",
                        (1.0 - (double) CharacterFactory.countCacheCharacters() / document.countCharacters()) * 100));

        System.out.println("\n=== 演示完毕 ===");

        // 额外演示：大量重复字符
        System.out.println("\n=== 大量重复字符演示 ===");
        Document largeDoc = new Document();

        // 创建1000个'A'字符
        for (int i = 0; i < 1000; i++) {
            largeDoc.addCharacter('A', "Arial", i * 10, 0, 12, "black");
        }

        System.out.println("大文档字符总数: " + largeDoc.countCharacters());
        System.out.println("享元对象总数: " + CharacterFactory.countCacheCharacters());
        System.out.println("大文档内存节省效果显著！");
    }

}
