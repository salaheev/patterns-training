package org.patterns.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class InchDistancer {

    private double lenght;

    public double show() {

        return lenght * 1.06;
    }

}
