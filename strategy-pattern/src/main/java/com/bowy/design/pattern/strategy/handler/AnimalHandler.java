package com.bowy.design.pattern.strategy.handler;

import com.bowy.design.pattern.strategy.constant.AnimalEnum;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiongbw
 */
@Component
public class AnimalHandler implements ApplicationContextAware {

    private static Map<AnimalEnum, AnimalSoundStrategy> VOICE_STRATEGY_MAP;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, AnimalSoundStrategy> voiceStrategyMap = applicationContext.getBeansOfType(AnimalSoundStrategy.class);
        setVoiceStrategyMap(voiceStrategyMap);
    }

    /**
     * 说
     *
     * @param animalEnum 动物枚举
     * @return 声音
     */
    public String say(AnimalEnum animalEnum) {
        AnimalSoundStrategy animalSoundStrategy = VOICE_STRATEGY_MAP.get(animalEnum);
        if (animalSoundStrategy == null) {
            String message = String.format("%s声暂未录入～", animalEnum.getName());
            throw new IllegalArgumentException(message);
        }

        return animalSoundStrategy.handle();
    }

    /**
     * 设置叫声策略
     *
     * @param strategyMap 策略集合
     */
    private void setVoiceStrategyMap(Map<String, AnimalSoundStrategy> strategyMap) {
        if (CollectionUtils.isEmpty(strategyMap)) {
            VOICE_STRATEGY_MAP = Collections.emptyMap();
            return;
        }

        Map<AnimalEnum, AnimalSoundStrategy> voiceStrategyMap = new HashMap<>((int) (strategyMap.size() / 0.75) + 1);
        strategyMap.values().forEach(voiceStrategy -> voiceStrategyMap.put(voiceStrategy.getAnimalEnum(), voiceStrategy));
        VOICE_STRATEGY_MAP = Collections.unmodifiableMap(voiceStrategyMap);
    }

}
