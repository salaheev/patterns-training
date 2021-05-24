package org.patterns.decorator;

import org.patterns.decorator.old.Printable;

public class JsonPrinterDecor extends PrinterDecor {
    public JsonPrinterDecor(Printable wrapper) {
        super(wrapper);
    }

    @Override
    public void print(String text) {
        super.print(toJson(text));
    }

    private String toJson(String text) {

        return "json: text";
    }
}
