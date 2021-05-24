package org.patterns.decorator;

import lombok.AllArgsConstructor;
import org.patterns.decorator.old.Printable;

@AllArgsConstructor
public class PrinterDecor implements Printable {

    private final Printable wrapper;

    @Override
    public void print(String text) {
        wrapper.print(text);
    }
}
