package com.bowy.design.pattern;

/**
 * 中介者接口
 *
 * @author xiongbw
 */
interface Mediator {

    /**
     * 通知
     *
     * @param sender  发送人
     * @param message 消息
     */
    void notify(Colleague sender, String message);

}