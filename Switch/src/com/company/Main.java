package com.company;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 1;
	    switch(switchValue)   //Good for testing different values for the same variable
        {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Values is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3 or 4 or 5");
            default:
                System.out.println("Values is not 1 or 2");
                break;
        }

        char myCharacter = 'A';
	    switch(myCharacter)
        {
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D': case 'E':
                System.out.println("Value is D or E");
                break;
            default:
                System.out.println("Value is not this");
                break;

        }

        String month = "January";
	    switch(month.toLowerCase())
        {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            case "april": case "may": case "june":
                System.out.println("Summer");
                break;

        }
    }
}
