package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter year of birth:");

		boolean hasNextInt = scanner.hasNextInt();

		if(hasNextInt)
		{
			int yearOfBirth = scanner.nextInt();
			scanner.nextLine(); // java interrupts the enter key as input.  use another scan to get around this

			System.out.println("Enter something:");
			String somethingEntered = scanner.nextLine();

			int age = 2018 - yearOfBirth;

			if(age >= 0 && age <= 120)
			{
				System.out.println("What was entered is " + somethingEntered + ", and the age is: " + age);
			}
			else
			{
				System.out.println("Invalid year of birth");
			}
		}
		else
		{
			System.out.println("Unable to parse year of birth");
		}



		scanner.close();
    }

}
