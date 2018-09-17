package com.company;

public class Main {

    public static void main(String[] args) {
	    int myVariable = 50; //whole line is a statement
        myVariable++; //also a statement

        System.out.println(
                "This " +
                "is " +
                "a " +
                "single " +
                "line"
        );

        String myString = "My string ";String anotherString = "on the same line";System.out.print(myString + anotherString);

        int             myIndentedInt
                =
                123
                ;

        System.out.print(myIndentedInt);

    }
}
