package com.bowy.design.pattern.adapter;

/**
 * 被适配电源
 *
 * @apiNote 已存在但接口不兼容的类
 */
class VoltageAdaptee {

    /**
     * 输出原始电压
     *
     * @return 原始电压
     */
    public int outputSrcVoltage() {
        return 220;
    }

}