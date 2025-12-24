package com.bowy.design.pattern.template;

/**
 * 具体子类A
 *
 * @author xiongbw
 * @apiNote 实现抽象类中定义的抽象方法，完成算法中特定步骤的实现
 */
class ConcreteClassA extends AbstractClass {

	@Override
	protected void processData() {
		System.out.println("[ConcreteClassA] 使用算法A处理数据");
	}

	@Override
	protected void saveData() {
		System.out.println("[ConcreteClassA] 保存数据到数据库");
	}

}

