package com.bowy.design.pattern.decorator;

/**
 * 奶泡
 *
 * @author xiongbw
 * @implNote 继承 {@link CoffeeDecorator}，作为 Concrete Decorator，负责向 {@link Coffee} 添加新的职责。
 */
class WhipDecorator extends CoffeeDecorator {

    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + 奶泡";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 3.0;
    }

}