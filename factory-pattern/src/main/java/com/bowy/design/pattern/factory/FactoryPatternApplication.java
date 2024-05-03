package com.bowy.design.pattern.factory;

import com.bowy.design.pattern.factory.constant.CarBrandEnum;
import com.bowy.design.pattern.factory.entity.Car;
import com.bowy.design.pattern.factory.handler.CarFactory;

/**
 * 工厂模式应用
 *
 * @author xiongbw
 */
public class FactoryPatternApplication {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();

		CarBrandEnum bmwEnum = getCarBrandEnum("BMW");
		Car bmw = carFactory.createCar(bmwEnum);
		System.out.printf("Created a new car: %s%n", bmw);

		CarBrandEnum lamborghiniEnum = getCarBrandEnum("LAMBORGHINI");
		Car lamborghini = carFactory.createCar(lamborghiniEnum);
		System.out.printf("Created a new car: %s%n", lamborghini);
	}

	private static CarBrandEnum getCarBrandEnum(String brand) {
		try {
			return CarBrandEnum.valueOf(brand);
		} catch (IllegalArgumentException e) {
			System.out.printf("The car brand is not exist: %s%n", brand);
			return null;
		}
	}

}
