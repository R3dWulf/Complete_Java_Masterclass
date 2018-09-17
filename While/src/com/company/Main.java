package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while ( count != 5)
        {
            System.out.println("Count while value is " + count);
            count++;
        }

        // the for loop version
        for ( count = 0; count != 5; count++)
        {
            System.out.println("Count for loop value is " + count);
        }


        int whileVersionOfCount = 1;
        while(true)
        {
            if(whileVersionOfCount == 5)
            {
                break;
            }
            System.out.println("Count while value true is " + whileVersionOfCount);
            whileVersionOfCount++;
        }


        // reset count
        count = 1;
        do
        {
            System.out.println("Coutn vales was " + count);
            count++;
            if(count > 100)
            {
                break;
            }
        }
        while( count != 6);

        int startNumber = 2;
        int finishNumber = 26;
        int totalOfEvenNumberFound = 0;
        int numberOfLoops = 0;


        while(startNumber <= finishNumber)
        {
            startNumber++;
            if(!isEvenNumber(startNumber))
            {
                continue;
            }
            System.out.println("Even number " + startNumber);
            totalOfEvenNumberFound++;
            if(totalOfEvenNumberFound >= 5)
                break;

        }

        System.out.println("Total of even numbers found: "+ totalOfEvenNumberFound);
        //isEvenNumber(9);
    }


    public static boolean isEvenNumber(int determineNumber)
    {
        if(determineNumber % 2 == 0)
        {
            //System.out.println("Your number is even");
            return true;
        }
        else
        {
            //System.out.println("Your number is odd");
            return false;
        }
    }
}
