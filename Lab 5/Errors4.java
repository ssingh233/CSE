import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;

		Scanner keyboard;

		System.out.println("Enter two ints and we print out sum as an int.");

		keyboard = new Scanner(System.in);

		n1 = keyboard.nextInt();

		System.out.println("Enter the first number: ");

		System.out.println("Enter the second number: ");
		n2 = keyboard.nextShort();

		System.out.println("The sum of the numbers is " + (float)(n1+n2));
	}

}