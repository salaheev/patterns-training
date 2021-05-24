package org.patterns.strategy;

public class MailSender implements Sender {


    @Override
    public void send(Message message) {
        System.out.println("I'm sending a message by email...");
    }
}
