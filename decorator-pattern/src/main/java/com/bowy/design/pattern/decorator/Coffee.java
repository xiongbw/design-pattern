package com.bowy.design.pattern.decorator;

/**
 * 咖啡
 *
 * @author xiongbw
 * @implSpec 定义原始对象和装饰类的 Component 通用接口，动态地为这些对象添加职责。
 */
public interface Coffee {

    /**
     * 获取描述
     *
     * @return 描述
     */
    String getDescription();

    /**
     * 获取金额
     *
     * @return 金额
     */
    double getCost();


}
