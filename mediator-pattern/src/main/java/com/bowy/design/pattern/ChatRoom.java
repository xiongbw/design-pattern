package com.bowy.design.pattern;

/**
 * 具体中介者：聊天室
 *
 * @author xiongbw
 */
class ChatRoom implements Mediator {

    private User userA;

    private User userB;

    public void setUserA(User userA) {
        this.userA = userA;
    }

    public void setUserB(User userB) {
        this.userB = userB;
    }

    @Override
    public void notify(Colleague sender, String message) {
        // 逻辑：A发 → B收；B发 → A收（简单广播可遍历所有用户）
        if (sender == userA) {
            userB.receive(message);
        } else if (sender == userB) {
            userA.receive(message);
        }
    }

}