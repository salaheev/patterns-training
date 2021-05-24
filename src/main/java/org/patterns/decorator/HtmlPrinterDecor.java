package org.patterns.decorator;

import org.patterns.decorator.old.Printable;

public class HtmlPrinterDecor extends PrinterDecor {
    public HtmlPrinterDecor(Printable wrapper) {
        super(wrapper);
    }

    @Override
    public void print(String text) {
        super.print(toHtml(text));
    }

    private String toHtml(String text) {

        return "<html>" + text + "</html>";
    }
}
