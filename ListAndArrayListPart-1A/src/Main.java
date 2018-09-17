import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
	    System.out.println("Enter 10 integers: ");
	    getInput();
	    resizeArray();
	    //System.out.println("Enter 12 integers");
	    //getInput();
        baseData[10] = 72;
        baseData[11] = 165;
	    printArray(baseData);
    }

    private static void getInput()
    {
        //Populate the index by getting values from user
        for(int i = 0; i < baseData.length; i++)
        {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array)
    {
        //Loop through the array to print what user entered
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Printing... " + array[i]);
        }

        System.out.println("()()()()()");
    }

    private static void resizeArray()
    {
        //Store original array
        int[]  original = baseData;
        //create new array with an index of 12
        baseData = new int[12];
        for(int i = 0; i < original.length; i++)
        {
            baseData[i] = original[i];
        }
    }
}
