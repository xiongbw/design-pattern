package com.bowy.design.pattern;

/**
 * 抽象同事类
 *
 * @author xiongbw
 * @implSpec 只依赖中介者，不依赖其他同事
 */
abstract class Colleague {

    /**
     * 中介者
     */
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 接收消息
     *
     * @param message 消息
     * @implSpec 子类可重写，用于响应消息
     */
    public abstract void receive(String message);

}