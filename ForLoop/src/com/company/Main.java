package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println("10,000 at 2% interest is: " + calculateInterest(10000, 2.0));

        int principleAmount = 10000;

        System.out.println("Year 1 Principle: " + principleAmount + " with interest rate of 2% = " + calculateInterest(principleAmount, 2) );

        for(int i = 2; i < 9; i++)
        {
            principleAmount += calculateInterest( principleAmount, 2);
            System.out.println( "Year " + i + " Principle: " + principleAmount + " with interest rate of 2% = " + String.format("%.2f",calculateInterest(principleAmount, 2)));
        }
        System.out.println("\n");

        for( int z = 10; z > 0; z--)
        {
            System.out.println(z);
        }

        int count = 0;
        for(int i = 0; i<50; i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10)
                {
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate/100));
    }


    public static boolean isPrime(int p)
    {
        if ( p == 1)
        {
            return false;
        }

        // for ( int i = 2; i <= (long) Math.sqrt(p); i++)  is an alternative and more efficient
        for( int i = 2; i <= (long) Math.sqrt(p); i++ ) // go through loop of numbers to find if p is dividable by 2, if yes then p is not a prime\
        {
            System.out.println("Looping through numbers. On cycle " + i);
            if( p % i == 0) // if p is diviable by a number other than itself, it is not a prime number
                return false;
        }

        return true;
    }

}
