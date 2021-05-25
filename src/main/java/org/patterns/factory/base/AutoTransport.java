package org.patterns.factory.base;

import java.awt.*;

public class AutoTransport implements Transport {

    @Override
    public String transfer(Point a, Point b) {
        return "transferring by auto from " + a + " to " + b;
    }
}
