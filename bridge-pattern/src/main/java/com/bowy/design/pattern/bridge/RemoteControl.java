package com.bowy.design.pattern.bridge;

/**
 * 远程遥控
 *
 * @author xiongbw
 * @implSpec 定义抽象类
 */
public abstract class RemoteControl {

    /**
     * 设备
     */
    private final Device device;

    /**
     * 是否开启
     */
    private boolean turnOn;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    /**
     * 按下按钮
     */
    public abstract void pressButton();

}
