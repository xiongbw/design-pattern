package com.bowy.design.pattern.builder;

/**
 * 抽象建造者
 *
 * @author xiongbw
 * @apiNote 定义构建电脑各个部分的抽象方法
 */
abstract class ComputerBuilder {

	/**
	 * 电脑对象
	 */
	protected Computer computer = new Computer();

	/**
	 * 构建 CPU
	 */
	public abstract void buildCpu();

	/**
	 * 构建内存
	 */
	public abstract void buildMemory();

	/**
	 * 构建硬盘
	 */
	public abstract void buildHardDisk();

	/**
	 * 构建显卡
	 */
	public abstract void buildGraphicsCard();

	/**
	 * 获取构建好的电脑
	 *
	 * @return 电脑对象
	 */
	public Computer getResult() {
		return computer;
	}

}

