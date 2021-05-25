package org.patterns.factory;

import java.awt.*;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String type = in.nextLine();

        TransportFactory factory;
        Point a = new Point(10, 62);
        Point b = new Point(12, 48);

        if (type.equals(TransportType.AUTO.name())) {
            factory = new AutoTransportFactory(a, b);
        } else {
            factory = new AviaTransportFactory(a, b);
        }

        System.out.println(factory.doTransfer());

    }

    enum TransportType {
        AVIA, AUTO
    }

}
