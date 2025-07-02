package com.bowy.design.pattern.adapter;

/**
 * 目标电压
 *
 * @author xiongbw
 * @apiNote 定义客户端需要的目标接口
 */
interface VoltageTarget {

    /**
     * 输出目标电压
     *
     * @return 目标电压
     */
    int outputDstVoltage();

}