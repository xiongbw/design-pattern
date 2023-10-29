package com.bowy.design.pattern.strategy.constant;

/**
 * 动物枚举
 *
 * @author xiongbw
 */
public enum AnimalEnum {

    /**
     * Dog animal enum.
     */
    DOG("狗"),

    /**
     * Cat animal enum.
     */
    CAT("猫"),

    /**
     * Chicken animal enum.
     */
    CHICKEN("鸡"),

    /**
     * Sheep animal enum.
     */
    SHEEP("羊"),

    /**
     * Wolf animal enum.
     */
    WOLF("狼")

    ;

    private final String name;

    public String getName() {
        return name;
    }

    AnimalEnum(String name) {
        this.name = name;
    }
}
