package com.bowy.design.pattern.builder;

/**
 * 建造者模式应用
 *
 * @author xiongbw
 */
public class BuilderPatternApplication {

	public static void main(String[] args) {
		// 创建指挥者
		Director director = new Director();

		System.out.println("========== 构建高端电脑 ==========");
		// 1. 创建高端电脑建造者
		ComputerBuilder highEndBuilder = new HighEndComputerBuilder();
		director.setBuilder(highEndBuilder);
		// 2. 通过指挥者构建电脑
		Computer highEndComputer = director.construct();
		System.out.println(highEndComputer);

		System.out.println("\n========== 构建经济型电脑 ==========");
		// 1. 创建经济型电脑建造者
		ComputerBuilder budgetBuilder = new BudgetComputerBuilder();
		director.setBuilder(budgetBuilder);
		// 2. 通过指挥者构建电脑
		Computer budgetComputer = director.construct();
		System.out.println(budgetComputer);

		System.out.println("\n========== 直接使用建造者（不使用指挥者） ==========");
		// 也可以直接使用建造者，不通过指挥者
		ComputerBuilder customBuilder = new HighEndComputerBuilder();
		customBuilder.buildCpu();
		customBuilder.buildMemory();
		// 可以自定义构建顺序或跳过某些步骤
		customBuilder.buildGraphicsCard();
		customBuilder.buildHardDisk();
		Computer customComputer = customBuilder.getResult();
		System.out.println(customComputer);
	}

}

