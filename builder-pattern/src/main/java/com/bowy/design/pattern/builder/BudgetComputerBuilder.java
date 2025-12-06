package com.bowy.design.pattern.builder;

/**
 * 经济型电脑建造者
 *
 * @author xiongbw
 * @apiNote 具体建造者，构建经济型配置的电脑
 */
class BudgetComputerBuilder extends ComputerBuilder {

    @Override
    public void buildCpu() {
        computer.setCpu("Intel i5-12400");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16GB DDR4");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("512GB SATA SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("集成显卡");
    }

}

