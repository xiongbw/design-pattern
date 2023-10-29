package com.bowy.design.pattern.strategy.handler.impl;

import com.bowy.design.pattern.strategy.constant.AnimalEnum;
import com.bowy.design.pattern.strategy.handler.AnimalSoundStrategy;
import org.springframework.stereotype.Component;

/**
 * 猫叫声策略
 *
 * @author xiongbw
 */
@Component
public class CatSoundStrategy implements AnimalSoundStrategy {

    @Override
    public AnimalEnum getAnimalEnum() {
        return AnimalEnum.CAT;
    }

    @Override
    public String handle() {
        return "喵～";
    }

}
