package com.company;

public class Main {

    public static void main(String[] args) {
        // 32 bits
        int myInt = 5 ;

        //**** Single precession *****
        //32 bits
        float myFloat = 5f; // or float myFloat = (float) 5.4;

        //*****Double precession *****
        // 64 bits
        // faster on modern computers
        double myDouble = 5d; //double precession


        System.out.println( myInt / 2 ); // equals 2
        System.out.println( myFloat / 2 ); // equals 2.5
        System.out.println( myDouble / 2); // equals 2.5

        System.out.println( myInt / 3 ); // equals 1
        System.out.println( myFloat / 3 ); // equals 1.6666666  8 decimal places
        System.out.println( myDouble / 3); // equals 1.6666666666666667   16 demical places

        double poundToKilos = 0.45359237d;

        System.out.println("Two kilos = " + ( poundToKilos * 2));
    }
}
