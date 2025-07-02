package com.bowy.design.pattern.adapter;

/**
 * 电压适配器
 *
 * @author xiongbw
 * @implSpec 实现目标接口
 */
class VoltageAdapter implements VoltageTarget {

    /**
     * 被适配对象
     */
    private final VoltageAdaptee adaptee;

    public VoltageAdapter(VoltageAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * @implNote 内部调用 {@link VoltageAdaptee#outputSrcVoltage()} 并进行转换，将 220V 转为 5V。
     */
    @Override
    public int outputDstVoltage() {
        // 获取原始电压
        int srcVoltage = adaptee.outputSrcVoltage();
        System.out.println("原始电源输出：" + srcVoltage);
        // 模拟电压转换（220V -> 5V）
        int dstVoltage = srcVoltage / 44;
        System.out.println("适配器转换后输出：" + dstVoltage + "V");
        return dstVoltage;
    }

}