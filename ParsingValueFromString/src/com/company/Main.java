package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.125";
	    System.out.println("numberAsString = " + numberAsString);

	    double numberAsInteger = Double.parseDouble(numberAsString);
	    System.out.println("Number As Integer = " + numberAsInteger);

	    numberAsString += 1;
	    numberAsInteger += 1;

        System.out.println("Number As String = " + numberAsString);
        System.out.println("Number As Integer = " + numberAsInteger);
    }
}
