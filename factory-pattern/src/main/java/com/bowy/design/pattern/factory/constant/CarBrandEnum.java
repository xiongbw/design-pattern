package com.bowy.design.pattern.factory.constant;

/**
 * 汽车品牌枚举
 *
 * @author xiongbw
 */
public enum CarBrandEnum {

    /**
     * BMW car enum.
     */
    BMW("宝马"),

    /**
     * Mercedes-Benz car enum.
     */
    BENZ("奔驰"),

    /**
     * Ferrari car enum.
     */
    FERRARI("法拉利"),

    /**
     * Lamborghini car enum.
     */
    LAMBORGHINI("兰博基尼"),

    ;

    private final String name;

    public String getName() {
        return name;
    }

    CarBrandEnum(String name) {
        this.name = name;
    }
}
