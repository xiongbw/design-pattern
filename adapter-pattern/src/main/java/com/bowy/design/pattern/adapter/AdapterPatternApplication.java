package com.bowy.design.pattern.adapter;

/**
 * 适配器模式应用
 *
 * @author xiongbw
 */
public class AdapterPatternApplication {

    /**
     * @apiNote 通过适配器调用目标接口，无需直接接触 Adaptee
     */
    public static void main(String[] args) {
        // 1. 创建被适配的 220V 电源
        VoltageAdaptee adaptee = new VoltageAdaptee();

        // 2. 创建适配器，传入被适配对象
        VoltageTarget adapter = new VoltageAdapter(adaptee);

        // 3. 客户端调用统一的 5V 接口（实际内部适配 220V）
        int voltage = adapter.outputDstVoltage();
        System.out.println("设备获得电压：" + voltage + "V");
    }

}
