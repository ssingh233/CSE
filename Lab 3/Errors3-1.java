package day3;

import java.util.Scanner;

public class  Errors3 {
	// needs brackets


	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int numerator ;
		// lower case i
		int denominator;
// interger is int
		System.out.println("This program divides two numbers.");
		// needs .out
		System.out.print("Enter the numerator: ");
		// add .out
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt();
		// spelling was incorrect

		System.out.print(numerator);
		// Capital System
		System.out.print("/");
		System.out.print(denominator);
		//Uppercase S for System lowercase p for print
		System.out.print(" = ");
		System.out.println((double) numerator/denominator);
		// lower case p for println
	}
}
// double bracket

