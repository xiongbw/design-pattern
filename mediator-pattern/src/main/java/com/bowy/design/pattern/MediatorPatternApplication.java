package com.bowy.design.pattern;

/**
 * 中介者模式应用
 *
 * @author xiongbw
 */
public class MediatorPatternApplication {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User alice = new User(chatRoom, "Alice");
        User bob = new User(chatRoom, "Boy");

        chatRoom.setUserA(alice);
        chatRoom.setUserB(bob);

        // Alice 发消息 → Boy 自动收到（中间无直接调用）
        alice.send("Hello, Boy!");
        bob.send("Hi, Alice!");
    }

}
