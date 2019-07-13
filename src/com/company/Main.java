package com.company;


import java.time.LocalDate;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java");

        Date data = new Date();

        System.out.println(data);

        String string = new Date().toString();

        System.out.println(string);

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2000, 12, 20));
    }
}
