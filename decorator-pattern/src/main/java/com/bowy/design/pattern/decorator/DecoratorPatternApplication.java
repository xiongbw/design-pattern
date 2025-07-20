package com.bowy.design.pattern.decorator;

/**
 * 装饰模式应用
 *
 * @author xinogbw
 */
public class DecoratorPatternApplication {

    public static void main(String[] args) {
        // 基础咖啡
        Coffee baseCoffee = new BaseCoffee();
        System.out.println(baseCoffee.getDescription() + " 价格: ¥" + baseCoffee.getCost());

        // 基础咖啡 + 牛奶
        Coffee milkCoffee = new MilkDecorator(baseCoffee);
        System.out.println(milkCoffee.getDescription() + " 价格: ¥" + milkCoffee.getCost());

        // 意式浓缩 + 牛奶 + 糖 + 奶泡
        Coffee coffee = new Espresso();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new WhipDecorator(coffee);
        System.out.println(coffee.getDescription() + " 价格: $" + coffee.getCost());
    }

}
