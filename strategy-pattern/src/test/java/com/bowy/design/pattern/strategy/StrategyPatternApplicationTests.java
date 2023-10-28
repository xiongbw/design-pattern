package com.bowy.design.pattern.strategy;

import com.bowy.design.pattern.strategy.constant.ArithmeticSymbolEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyPatternApplicationTests  {

    @Test
    void arithmeticStrategy() {
        final int a = 1;
        final int b = 2;
        int result = ArithmeticSymbolEnum.PLUS.calculate(a, b);
        System.out.printf("%s + %s = %s", a, b, result);
    }

}
