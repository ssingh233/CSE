package day3;
// I added a new line
import java.util.Scanner; 
public class Errors1 {

	public static void main(String[] args) {
		System.out.println("Can you spot and fix the errors?");

		System.out.println("Enter two numbers and I ");
		System.out.println("add them for you");
		Scanner input = new Scanner(System.in); 

		int n1, n2;

		Scanner keyboard = new Scanner(System.in);
		// Missing semicolon 
				System.out.println("Please enter first number");
		n1 = input.nextInt();
		// missing input.
		System.out.println("Please enter second number");
		n2 = input.nextInt();
		// missing input
		System.out.print("The sum of the numbers is");
		System.out.println(n1 + n2);
		// The sum is addition not subtraction
	}
}