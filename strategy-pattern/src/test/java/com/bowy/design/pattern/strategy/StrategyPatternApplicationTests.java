package com.bowy.design.pattern.strategy;

import com.bowy.design.pattern.strategy.constant.AnimalEnum;
import com.bowy.design.pattern.strategy.constant.ArithmeticSymbolEnum;
import com.bowy.design.pattern.strategy.handler.AnimalHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyPatternApplicationTests  {

    @Autowired
    private AnimalHandler animalHandler;

    @Test
    void arithmeticStrategy() {
        final int a = 1;
        final int b = 2;
        int result = ArithmeticSymbolEnum.PLUS.calculate(a, b);
        System.out.printf("%s + %s = %s", a, b, result);
    }

    @Test
    void animalSoundStrategy() {
        final AnimalEnum animalEnum = AnimalEnum.CAT;
        String voice = animalHandler.say(animalEnum);
        System.out.printf("%s说：%s", animalEnum.getName(), voice);
    }

}
