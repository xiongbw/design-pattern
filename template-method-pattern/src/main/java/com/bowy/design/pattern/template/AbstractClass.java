package com.bowy.design.pattern.template;

/**
 * 抽象类
 *
 * @author xiongbw
 * @apiNote 定义模板方法，实现算法的骨架，声明抽象方法供子类实现
 */
abstract class AbstractClass {

	/**
	 * 模板方法
	 * 定义算法的骨架，按照固定顺序调用各个步骤
	 */
	public final void templateMethod() {
		// 步骤1：准备数据
		prepareData();
		// 步骤2：处理数据（由子类实现）
		this.processData();
		// 步骤3：保存数据（由子类实现）
		this.saveData();
		// 步骤4：清理资源（钩子方法，可选）
		if (this.needCleanup()) {
			cleanup();
		}
	}

	/**
	 * 准备数据（具体方法）
	 */
	private void prepareData() {
		System.out.println("准备数据...");
	}

	/**
	 * 处理数据（抽象方法，由子类实现）
	 */
	protected abstract void processData();

	/**
	 * 保存数据（抽象方法，由子类实现）
	 */
	protected abstract void saveData();

	/**
	 * 清理资源（钩子方法，子类可以选择性覆盖）
	 *
	 * @return 是否需要清理
	 */
	protected boolean needCleanup() {
		return false;
	}

	/**
	 * 清理资源（具体方法）
	 */
	private void cleanup() {
		System.out.println("清理资源...");
	}

}

