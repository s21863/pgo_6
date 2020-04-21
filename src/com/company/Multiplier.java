package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Multiplier {
    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static int multiply(int a, int b, int c, int d) {
        return (a * b * c * d);
    }

    public static double multiply(double a, double b) {
        return (a * b);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return (a.multiply(b));
    }

    public double Multiply(ArrayList<Integer> numbers) {
        return 0;
    }
}

