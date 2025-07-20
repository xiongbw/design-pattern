package com.bowy.design.pattern.decorator;

/**
 * 简单咖啡
 *
 * @author xiongbw
 * @implNote 实现 {@link Coffee}，作为具体组件 Concrete Component。
 */
public class BaseCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "简单咖啡";
    }

    @Override
    public double getCost() {
        return 10.0;
    }

}
