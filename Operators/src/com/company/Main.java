package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result + "(remainder)");

        previousResult = result;
        result++;
        System.out.println("Result is " + result);

        previousResult = result;
        result--;
        System.out.println("Result is " + result);

        previousResult = result;
        result += 2;
        System.out.println("Result is " + result);

        previousResult = result;
        result -= 2;
        System.out.println("Result is " + result);

        previousResult = result;
        result *= 10;
        System.out.println("Result is " + result);

        previousResult = result;
        result /= 2;
        System.out.println("Result is " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.print("Is not an alien");

        if (!isAlien)
            System.out.print("\nStill not an alien");

        int topScore = 100;
        if( topScore >= 100 )
            System.out.println("Tops core is 100");

        if( topScore <= 100 )
            System.out.println("Still have top score is 100");

        int secondScore = 60;
        if( topScore == 100 && secondScore == 60)
            System.out.println("Top score still stands");

        if(topScore > secondScore || secondScore != 0)
            System.out.print("Undefeated");

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        System.out.println("\nIs it a car? " + wasCar);

        double myDouble = 20d;
        double mySecondDouble = myDouble * 4;
        double myThirdDouble = (myDouble + mySecondDouble) * 25;
        double myRemainder = myThirdDouble % 40;
        System.out.println("My Total equals " + myThirdDouble);
        if( myRemainder <= 20 )
            System.out.println("Total is over the limit");

    }
}