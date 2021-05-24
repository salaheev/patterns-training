package org.patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Message {
    private String to;
    private String from;
    private String text;
    private LocalDateTime sentTime;
}
