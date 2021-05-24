package org.patterns.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MmDistancer {

    private double length;

    public double show() {

        return length * 0.6;
    }

}
