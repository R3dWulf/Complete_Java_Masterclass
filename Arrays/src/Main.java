import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
//	    int[] myIntArray = new int[13]; // ii assigned 10 elements to the array
//        int[] myFilledArray = {11,34,2,909,473, 23,172, 8, 420, 290};

        //myIntArray[5] = 50; // position 6 in the array gets the value 50;
        //myIntArray = {11,34,2,909,473, 23,172, 8, 420, 290};

//        double[] myDoubleArray = new double[10];
//
//        for(int i = 0; i< myIntArray.length; i++)
//        {
//            myIntArray[i] = i * 10;
//        }
//
//        for(int i = 0; i< myIntArray.length; i++)
//        {
//            System.out.println("()()()Integer Array: "+myIntArray[i]);
//        }
//
//
//        for(int i = 0; i<myFilledArray.length; i++)
//        {
//            System.out.println("### Filled Array: " + myFilledArray[i]);
//        }
//
//        printArray(myIntArray);
//
//    }
//
//    public static void printArray(int[] arrayParams)
//    {
//        for(int i = 0; i<arrayParams.length; i++)
//        {
//            System.out.println("^^^ printed from Method() Array: " + arrayParams[i]);
//        }
//    }


        int[] myIntegers = getIntegers(5);

        for(int i = 0; i<myIntegers.length; i++)
        {
            System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
        }

        System.out.println("Average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number)
    {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i =0; i<values.length; i++)
        {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array)
    {
        int sumTotal = 0;
        for(int i =0; i < array.length; i++)
        {
            sumTotal += array[i];
        }

        return (double) sumTotal / (double) array.length;
    }

}
