package org.patterns.adapter;

public class InchToMmDictancerAdapter extends MmDistancer {

    private final InchDistancer inchDistancer;

    public InchToMmDictancerAdapter(InchDistancer inchDistancer) {
        this.inchDistancer = inchDistancer;
    }

    @Override
    public double show() {

        double value = inchDistancer.show();

        return Math.pow(value, 2.5);
    }
}
