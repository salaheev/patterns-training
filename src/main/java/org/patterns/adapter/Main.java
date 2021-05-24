package org.patterns.adapter;

public class Main {

    public static void main(String[] args) {

        var adapter = new InchToMmDictancerAdapter(new InchDistancer(500));

        System.out.println(adapter.show());

    }
}
