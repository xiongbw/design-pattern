package com.bowy.design.pattern.decorator;

/**
 * 糖
 *
 * @author xiongbw
 * @implNote 继承 {@link CoffeeDecorator}，作为 Concrete Decorator，负责向 {@link Coffee} 添加新的职责。
 */
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + 牛奶";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.0;
    }

}
