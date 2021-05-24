package org.patterns.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SendService {

    private final Message message;

    public void sendMessage(Sender sender) {
        sender.send(message);
    }
}
