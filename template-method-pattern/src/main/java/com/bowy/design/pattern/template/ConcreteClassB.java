package com.bowy.design.pattern.template;

/**
 * 具体子类B
 *
 * @author xiongbw
 * @apiNote 实现抽象类中定义的抽象方法，并覆盖钩子方法
 */
class ConcreteClassB extends AbstractClass {

	@Override
	protected void processData() {
		System.out.println("[ConcreteClassB] 使用算法B处理数据");
	}

	@Override
	protected void saveData() {
		System.out.println("[ConcreteClassB] 保存数据到文件");
	}

	@Override
	protected boolean needCleanup() {
		// 覆盖钩子方法，启用清理功能
		return true;
	}

}

