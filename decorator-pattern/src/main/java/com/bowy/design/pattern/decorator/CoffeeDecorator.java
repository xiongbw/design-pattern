package com.bowy.design.pattern.decorator;

/**
 * 咖啡料
 *
 * @author xiongbw
 * @implSpec 继承或实现 {@link Coffee} 接口，持有一个 {@link Coffee} 对象的引用，作为 Decorator 抽象装饰器类。
 */
public abstract class CoffeeDecorator implements Coffee {

    /**
     * 咖啡
     */
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

}
