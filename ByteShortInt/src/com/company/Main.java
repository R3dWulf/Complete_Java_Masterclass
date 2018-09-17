package com.company;

public class Main {

    public static void main(String[] args) {
        //***************** Whole Numbers ******************
        //Width of 32 bits 2^31
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;

        //Allocated to a quarter the amount of space than an integer.
        //Width of 8 bits
        //Cannot accept expressions, must use casting
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByte = (byte) ( myMaxByteValue / 2);


        // Shorts are allocated twice the space of a byte and half the space of an integer
        //Width of 16 bits
        //Cannot accept expressions, must use casting
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myNewShortValue = (short) ( myMaxShortValue / 2);

        //Width of 64 bits 2^63
        long myMinLongValue =-9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;


        int intTest = 10;
        byte byteTest = 20;
        short shortTest = 30;
        long longTest = 50000L + 10L * ( intTest + byteTest + shortTest );
        System.out.println(longTest);

    }
}
