import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		int count = 0;
		System.out.print("ENTER MAXIMUM NUMBER ");

		int max = input.nextInt();
		while ( i <= max) {
			System.out.println("Number " + i);
			i++;
		}

		int sum = max;
		while (count <= max){
			sum = (sum + count);
			count = count + 1;
		}
		sum -= max;
		
		System.out.println("Sum of All is " + sum);
		input.close();
		return;

	}

}
