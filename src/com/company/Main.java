package com.company;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.company.Adder.add;
import static com.company.Address.createAddress;
import static com.company.Multiplier.multiply;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiply(1, 2));
        System.out.println(multiply(1, 2, 3, 4));
        System.out.println(multiply(3.14, 14.3));
        System.out.println(add(2020, 1997));
        System.out.println(createAddress("Poland", "Warsaw"));
        System.out.println(createAddress("Poland", "Warsaw", "00-277"));
        System.out.println(createAddress("Poland", "Warsaw", "00-277", "pl.Zamkowy"));
        System.out.println(createAddress("Poland", "Warsaw", "00-277", "pl.Zamkowy", "4"));
    }
}