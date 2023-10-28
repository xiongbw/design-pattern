package com.bowy.design.pattern.strategy.constant;

/**
 * 算术符号枚举
 *
 * @author xiongbw
 */
public enum ArithmeticSymbolEnum {

    /**
     * 加
     */
    PLUS {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    },

    /**
     * 减
     */
    MINUS {
        @Override
        public int calculate(int a, int b) {
            return a - b;
        }
    },

    /**
     * 乘
     */
    MULTIPLY {
        @Override
        public int calculate(int a, int b) {
            return a * b;
        }
    },

    /**
     * 除
     */
    DIVIDE {
        @Override
        public int calculate(int a, int b) {
            return a / b;
        }
    };

    /**
     * 计算
     *
     * @param a 数值 a
     * @param b 数值 b
     * @return 计算结果
     */
    public abstract int calculate(int a, int b);

}
