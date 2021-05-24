package org.patterns.strategy;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        var message = new Message("Dan", "Ben", "HELLO", LocalDateTime.now());

        var sender = new SendService(message);
        sender.sendMessage(new SmsSender());

    }

}
