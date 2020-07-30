import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		double average;
		
		System.out.print("ENTER MAXIMUM NUMBER ");
		int max = input.nextInt();
		
		int sum = max;
		while (count <= max){
			sum = (sum + count);
			count = count + 1;
		}
		sum -= max;
		average = (double)sum / (double)(max + 1);
		
		System.out.println("Average of All is " + average);
		input.close();
		return;
	}

}
