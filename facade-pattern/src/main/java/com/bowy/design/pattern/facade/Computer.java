package com.bowy.design.pattern.facade;

/**
 * 电脑
 *
 * @author xiongbw
 * @implNote 外观类
 */
public class Computer {

    private CPU cpu;

    private Memory memory;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
    }

    public void start() {
        cpu.start();
        memory.load();
    }

    class CPU {
        public void start() {
            System.out.println("CPU starting...");
        }
    }

    class Memory {
        public void load() {
            System.out.println("Memory loading...");
        }
    }

}