package com.bowy.design.pattern.bridge;

/**
 * 基础远程遥控
 *
 * @author xiongbw
 * @implNote 扩展抽象类
 */
public class BasicRemoteControl extends RemoteControl {

    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void pressButton() {
        System.out.println("按下按钮");

        if (this.isTurnOn()) {
            this.getDevice().turnOff();
        } else {
            this.getDevice().turnOn();
        }

        this.setTurnOn(!this.isTurnOn());
    }

}
