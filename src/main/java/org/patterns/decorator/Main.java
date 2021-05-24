package org.patterns.decorator;

import org.patterns.decorator.old.Printable;
import org.patterns.decorator.old.Printer;

public class Main {

    public static void main(String[] args) {

        Printable print = new PrinterDecor(new JsonPrinterDecor(new Printer()));

        print.print("HELLO MY FRIEND!!!");

    }

}
