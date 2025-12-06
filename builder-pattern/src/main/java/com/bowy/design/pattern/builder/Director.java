package com.bowy.design.pattern.builder;

/**
 * 指挥者
 *
 * @author xiongbw
 * @apiNote 负责调用建造者的方法，按照特定顺序构建产品
 */
class Director {

	/**
	 * 建造者
	 */
	private ComputerBuilder builder;

	/**
	 * 设置建造者
	 *
	 * @param builder 建造者
	 */
	public void setBuilder(ComputerBuilder builder) {
		this.builder = builder;
	}

	/**
	 * 构建电脑
	 *
	 * @return 构建好的电脑
	 */
	public Computer construct() {
		builder.buildCpu();
		builder.buildMemory();
		builder.buildHardDisk();
		builder.buildGraphicsCard();
		return builder.getResult();
	}

}

