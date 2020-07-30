import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		char character = 'A';
		
		
		if ( num < 0 || num > 25 )
		{
			System.out.println("Outside of acceptable range");
		}
		else
			System.out.println((int)(num) + " character of the alphabet is " + (char) (num + character));
	
	}

}
