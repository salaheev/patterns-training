package org.patterns.strategy;

public class SmsSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("I'm sending message by sms...");
    }
}
