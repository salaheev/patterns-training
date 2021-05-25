package org.patterns.factory;

import org.patterns.factory.base.AviaTransport;
import org.patterns.factory.base.Transport;

import java.awt.*;

public class AviaTransportFactory extends TransportFactory {

    public AviaTransportFactory(Point a, Point b) {
        super(a, b);
    }

    @Override
    Transport createTransport() {
        return new AviaTransport();
    }
}
