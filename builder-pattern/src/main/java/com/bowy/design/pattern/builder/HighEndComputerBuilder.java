package com.bowy.design.pattern.builder;

/**
 * 高端电脑建造者
 *
 * @author xiongbw
 * @apiNote 具体建造者，构建高端配置的电脑
 */
class HighEndComputerBuilder extends ComputerBuilder {

	@Override
	public void buildCpu() {
		computer.setCpu("Intel i9-13900K");
	}

	@Override
	public void buildMemory() {
		computer.setMemory("32GB DDR5");
	}

	@Override
	public void buildHardDisk() {
		computer.setHardDisk("2TB NVMe SSD");
	}

	@Override
	public void buildGraphicsCard() {
		computer.setGraphicsCard("NVIDIA RTX 4090");
	}

}

