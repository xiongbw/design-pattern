package com.bowy.design.pattern.bridge;

/**
 * 设备
 *
 * @author xiongbw
 * @implSpec 定义实现接口
 */
public interface Device {

    /**
     * 打开
     */
    void turnOn();

    /**
     * 关闭
     */
    void turnOff();

}
