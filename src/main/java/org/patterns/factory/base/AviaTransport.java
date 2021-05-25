package org.patterns.factory.base;

import java.awt.*;

public class AviaTransport implements Transport {
    @Override
    public String transfer(Point a, Point b) {

        System.out.println("Flying");
        return "transferring from " + a + " to " + b;
    }
}
