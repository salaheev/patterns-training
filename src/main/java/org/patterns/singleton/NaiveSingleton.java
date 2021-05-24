package org.patterns.singleton;

import lombok.Data;

@Data
public class NaiveSingleton {

    private int number;

    private static NaiveSingleton INSTANCE;

    private NaiveSingleton(){}

    public static NaiveSingleton getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new NaiveSingleton();
        }
        return INSTANCE;
    }
}
