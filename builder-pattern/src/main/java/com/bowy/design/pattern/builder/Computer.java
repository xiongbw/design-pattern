package com.bowy.design.pattern.builder;

/**
 * 产品类（电脑）
 *
 * @author xiongbw
 * @apiNote 被构建的复杂对象，包含多个组成部分
 */
class Computer {

	/**
	 * CPU
	 */
	private String cpu;

	/**
	 * 内存
	 */
	private String memory;

	/**
	 * 硬盘
	 */
	private String hardDisk;

	/**
	 * 显卡
	 */
	private String graphicsCard;

	/**
	 * 设置 CPU
	 *
	 * @param cpu CPU
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * 设置内存
	 *
	 * @param memory 内存
	 */
	public void setMemory(String memory) {
		this.memory = memory;
	}

	/**
	 * 设置硬盘
	 *
	 * @param hardDisk 硬盘
	 */
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}

	/**
	 * 设置显卡
	 *
	 * @param graphicsCard 显卡
	 */
	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	@Override
	public String toString() {
		return String.format("电脑配置：CPU=%s, 内存=%s, 硬盘=%s, 显卡=%s", cpu, memory, hardDisk, graphicsCard);
	}

}

