import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // --- Long Way

	    ArrayList<Integer> intArrayList = new ArrayList<Integer>();

	    for(int i = 0; i<=10; i++)
        {
            intArrayList.add(Integer.valueOf(i)); //Autoboxing, int type --> Class Integer
        }

        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Long way: index[" + i + "] --> " + intArrayList.get(i).intValue()); // Boxing, Class Integer to int type
        }

        // -- Short Way

        Integer myIntValue = 32; // Autoboxing
	    int myInt = myIntValue.intValue(); // Boxing


        // Using Double

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        for(double i = 0.0; i<=10.0; i+= 0.5)
        {
            //doubleArrayList.add(Double.valueOf(i)); // long way
            doubleArrayList.add(i); // short way
        }

        for(int i = 0; i < doubleArrayList.size(); i++)
        {
            //double value = doubleArrayList.get(i).doubleValue();  // Long Way
            double value = doubleArrayList.get(i); // Short way
            System.out.println("Double: index[" + i + "] " + value );
        }


    }
}
