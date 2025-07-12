package com.bowy.design.pattern.bridge;

/**
 * 收音机
 *
 * @author xiongbw
 * @implNote 实现具体实现类
 */
public class Radio implements Device {

    @Override
    public void turnOn() {
        System.out.println("收音机开机");
    }

    @Override
    public void turnOff() {
        System.out.println("收音机关机");
    }

}
