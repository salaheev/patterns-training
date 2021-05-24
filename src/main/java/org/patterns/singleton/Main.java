package org.patterns.singleton;

public class Main {

    public static void main(String[] args) {

        NaiveSingleton instance = NaiveSingleton.getINSTANCE();
        instance.setNumber(100);

        System.out.println(instance);

        var eNumSingleton = EnumSingleton.INSTANCE;

        System.out.println(eNumSingleton.getNumber());

    }
}
