package com.bowy.design.pattern.bridge;

/**
 * 桥接模式应用
 *
 * @author xiongbw
 */
public class BridgePatternApplication {

    public static void main(String[] args) {
        // TV 遥控器
        Device tv = new TV();
        RemoteControl tvRemoteControl = new BasicRemoteControl(tv);
        tvRemoteControl.pressButton();

        // Radio 遥控器
        Device radio = new Radio();
        RemoteControl radioRemoteControl = new BasicRemoteControl(radio);
        radioRemoteControl.pressButton();
    }

}
