package com.bowy.design.pattern;

/**
 * 具体同事类
 *
 * @author xiongbw
 */
class User extends Colleague {

    private final String name;

    public User(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    /**
     * 对外提供“发消息”接口 → 实际是通知中介者
     *
     * @param message 消息
     */
    public void send(String message) {
        System.out.println(name + " 发送: " + message);
        mediator.notify(this, message);  // ← 核心：不找别人，只找中介！
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " 收到: " + message);
    }

}