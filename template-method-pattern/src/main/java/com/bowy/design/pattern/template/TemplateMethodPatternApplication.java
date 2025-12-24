package com.bowy.design.pattern.template;

/**
 * 模板方法模式应用
 *
 * @author xiongbw
 */
public class TemplateMethodPatternApplication {

	public static void main(String[] args) {
		System.out.println("========== 使用 ConcreteClassA ==========");
		AbstractClass classA = new ConcreteClassA();
		classA.templateMethod();

		System.out.println("\n========== 使用 ConcreteClassB ==========");
		AbstractClass classB = new ConcreteClassB();
		classB.templateMethod();
	}

}

