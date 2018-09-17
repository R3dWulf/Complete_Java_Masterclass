import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("AnotherIntValue : " + anotherIntValue);

        anotherIntValue++;
        System.out.println("AnotherIntValue : " + anotherIntValue);

        int[] myIntArray = new int[5]; // This is a reference to an array in memory
        int[] anotherArray = myIntArray; //A different reference pointing to the same object in memory

        System.out.print("myIntArray = " + Arrays.toString(myIntArray));
        System.out.print("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.print("\n" + "NO change to myIntArray = " + Arrays.toString(myIntArray)); // displays [1,0,0,0,0]
        System.out.print("\n" + "After change to anotherArray = " + Arrays.toString(anotherArray)); // displays [1,0,0,0,0]

        // References represent the variable, not the data itself, and
        // the variables are an address pointing to the one array in memory

        anotherArray = new int[] {5,6,7,8,9};
        modifyArray(myIntArray);

        System.out.print("\n" + "Modified myIntArray = " + Arrays.toString(myIntArray)); // displays [2,0,0,0,0]
        System.out.print("\n" + "Modified anotherArray = " + Arrays.toString(anotherArray)); // displays [5,6,7,8,9]

        reverse(anotherArray);

        System.out.print("\n" + "Reversed myIntArray = " + Arrays.toString(myIntArray)); // displays [2,0,0,0,0]
        System.out.print("\n" + "Reversed anotherArray = " + Arrays.toString(anotherArray)); // displays [9,8,7,6,5]
    }

    private static void modifyArray(int[] array)
    {
        array[0] = 2;

        array = new int[] {1,2,3,4,5}; // setting new array
    }

    private static void  reverse(int[] array)
    {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for ( int i = 0; i < halfLength; i++)
        {
            int temp = array[i]; // temp = array[0], on loop one
            array[i] = array[maxIndex - i]; // array[0] = array[4 - 0]
            array[maxIndex - i] = temp; // array[4 - 0] = array[0]
        }
    }
}
