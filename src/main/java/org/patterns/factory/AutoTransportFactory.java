package org.patterns.factory;

import org.patterns.factory.base.AutoTransport;
import org.patterns.factory.base.Transport;

import java.awt.*;

public class AutoTransportFactory extends TransportFactory {


    public AutoTransportFactory(Point a, Point b) {
        super(a, b);
    }

    @Override
    Transport createTransport() {
        return new AutoTransport();
    }
}
