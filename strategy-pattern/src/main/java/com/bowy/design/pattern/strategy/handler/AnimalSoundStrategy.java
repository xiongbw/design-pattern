package com.bowy.design.pattern.strategy.handler;

import com.bowy.design.pattern.strategy.constant.AnimalEnum;

/**
 * 动物叫声策略
 *
 * @author xiongbw
 */
public interface AnimalSoundStrategy {

    /**
     * 获取动物枚举
     *
     * @return 动物枚举
     */
    AnimalEnum getAnimalEnum();

    /**
     * 处理
     *
     * @return 动物叫声
     */
    String handle();

}
