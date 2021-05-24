package org.patterns.decorator.old;


public class Printer implements Printable {

    @Override
    public void print(String text) {
        System.out.println("Printing a text");
        System.out.println(text);
    }
}
