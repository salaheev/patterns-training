package org.patterns.factory;

import lombok.AllArgsConstructor;
import org.patterns.factory.base.Transport;

import java.awt.*;

@AllArgsConstructor
public abstract class TransportFactory {

    private final Point a;
    private final Point b;

    public String doTransfer() {
        Transport transport = createTransport();

        return transport.transfer(a, b);
    }

    abstract Transport createTransport();
}
