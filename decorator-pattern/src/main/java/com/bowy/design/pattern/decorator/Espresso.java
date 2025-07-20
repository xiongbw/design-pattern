package com.bowy.design.pattern.decorator;

/**
 * 简单咖啡
 *
 * @author xiongbw
 * @implNote 实现 {@link Coffee}，作为具体组件 Concrete Component。
 */
public class Espresso implements Coffee {

    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }

    @Override
    public double getCost() {
        return 15.0;
    }

}
