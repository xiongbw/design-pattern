package com.bowy.design.pattern.strategy.handler.impl;

import com.bowy.design.pattern.strategy.constant.AnimalEnum;
import com.bowy.design.pattern.strategy.handler.AnimalSoundStrategy;
import org.springframework.stereotype.Component;

/**
 * 鸡叫声策略
 *
 * @author xiongbw
 */
@Component
public class ChickenSoundStrategy implements AnimalSoundStrategy {

    @Override
    public AnimalEnum getAnimalEnum() {
        return AnimalEnum.CHICKEN;
    }

    @Override
    public String handle() {
        return "咯咯哒……";
    }

}
