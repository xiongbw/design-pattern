package com.bowy.design.pattern.bridge;

/**
 * 电视
 *
 * @author xiongbw
 * @implNote 实现具体实现类
 */
public class TV implements Device {

    public void turnOn() {
        System.out.println("电视开机");
    }

    public void turnOff() {
        System.out.println("电视关机");
    }

}