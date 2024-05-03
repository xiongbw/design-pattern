package com.bowy.design.pattern.factory.handler;

import com.bowy.design.pattern.factory.constant.CarBrandEnum;
import com.bowy.design.pattern.factory.entity.*;

/**
 * 汽车工厂
 *
 * @author xiongbw
 * @apiNote 简单工厂
 */
public class CarFactory {

    public Car createCar(CarBrandEnum carBrandEnum) {
        if (carBrandEnum == null) {
            return null;
        }

        switch (carBrandEnum) {
            case BMW:
                return new Bmw();

            case BENZ:
                return new Benz();

            case FERRARI:
                return new Ferrari();

            case LAMBORGHINI:
                return new Lamborghini();

            default:
                return null;
        }

    }

}
