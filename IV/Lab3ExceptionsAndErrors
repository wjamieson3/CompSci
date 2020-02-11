package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Part 1 - Try-Catch
		 * 
		 * Using a Try-Catch, fix the part1() method to be able to maintain control and
		 * continue after the user enters non-int values (decimals/characters).
		 */

		// part1();

		/*----------------------------------------------
		 * Part 2 - Try-Catch-Finally
		 * 
		 * Handle the exception thrown by part2() for the file not being in the
		 * directory. Also makes sure that the code continues if there are non-int
		 * values in the text file. Be sure to handle the cleanup code necessary for
		 * dealing with a Scanner.
		 */

		// part2();

		/*----------------------------------------------
		 * Part 3 - Exception Propagation
		 * There are exceptions being thrown by part3C() and part3D(). 
		 * Catch and deal with the exceptions outside of part3C() part3D()
		 * but before it reaches the main(). 
		 * 
		 */

		// part3A();

		/*----------------------------------------------
		 * Part 4 - throws vs throw
		 * 
		 * Have the body of part4() throw a FileNotFoundException.
		 * Change the signature of the part4() method to say that it
		 * throws the exception. Successfully call part4() from the
		 * main(). 
		 * 
		 */

		// part4();

		/*----------------------------------------------
		 * Part 5 - Custom Exception 
		 * 
		 * Create a custom exception class for if someone
		 * enters an incorrect age. Have part5() ask for the 
		 * user's age, if the age is below 18 you will throw
		 * a new instance of your custom exception and catch it.
		 * Have the method constantly ask until a valid age is displayed.
		 */

		// part5();

		/*----------------------------------------------
		 * Part 6 - Challenge - Chained Exceptions
		 * 
		 * Do some research on chained exceptions and see how it can be used with your
		 * Custom Exception.
		 *
		 */

	}

	public static void part1() {
		Scanner scan = new Scanner(System.in);

		int num = 0;

		do {
			System.out.println("Enter a number between 1 and 10");
			num = scan.nextInt();

			if (num < 1 || num > 10) {
				System.out.println("\nIllegal value, " + num + " entered.  Please try again.");
			}
		} while (num < 1 || num > 10);

		System.out.println("\nValue correctly entered! Thank you.");

	}

//	public static void part2() {
//		int total = 0;
//		int num = 0;
//
//		File myFile = null;
//		Scanner inputFile = null;
//
//		myFile = new File("textFile.txt");
//		inputFile = new Scanner(myFile);
//
//		while (inputFile.hasNext()) {
//			num = inputFile.nextInt();
//			total += num;
//		}
//		System.out.println("The total value is " + total);
//
//	}

	public static void part3A() {
		part3B();

		part3D();
	}

	public static void part3B() {
		part3C();

	}

	public static void part3C() {
		int x = 100 / 0;
	}

	public static void part3D() {
		int arr[] = { 1, 2, 3, 4 };

		System.out.println(arr[9]);
	}

	public static void part4() {

	}

	public static void part5() {

	}

}
