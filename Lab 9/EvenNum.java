import java.util.Scanner;
public class EvenNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int even = 0;
		
		System.out.print("ENTER MAXIMUM NUMBER ");
		int max = input.nextInt();
		
		while (even <= max){
			System.out.println("Number " + even);
			even += 2;
		}
		
		input.close();
		return;
			
			
	}

}
