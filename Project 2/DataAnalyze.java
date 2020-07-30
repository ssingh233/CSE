import java.util.Scanner;
public class DataAnalyze {

	public static void main(String[] args) {

		int max = 10000;
		int minAvrg = Integer.MAX_VALUE;
		int maxAvrg = Integer.MIN_VALUE;
		int h = 0;
		int i = 0;
		int arr1[] = new int [max+1];
		int arr2[] = new int [max+1];
		int arr3[] = new int [max+1];
		int arr4[] = new int [max+1];
		int total;
		int count;

		Scanner input = new Scanner (System.in);

		System.out.print("Please enter the sample size: ");
		int SampSize = input.nextInt();

		System.out.println("Enter numbers for Trial " + i);
		i++;
		total = 0;
		count = 0;
		for (h = 0; h < SampSize; h++){

			System.out.print("Enter sample #" + h + ":");
			int sample = input.nextInt();

			if (sample == 2){
				count--;
			}

			if (sample > 0){
				arr1[h] = sample;
				total = total + sample;
				count++;
			}
			else if (sample < 0){
				arr1[h] = 0;
				total = total + sample;
				count++;
			}
			arr1[max] = total/count;
		} System.out.println();
		total = 0;
		count = 0;

		System.out.println("Enter number for Trial " + i);
		i++;

		for (h = 0; h < SampSize; h++){
			System.out.print("Enter sample #" + h + ":");
			int sample = input.nextInt();

			if(sample > 0){
				arr2[h] = sample;
				total += sample;
				count++;
			}
			else if(sample < 0){
				arr2[h] = 0;
				total = total + sample;
				count++;
			}
			arr2[max] = total/count;

		} System.out.println();
		total = 0;
		count = 0;

		System.out.println("Enter number for Trial " + i);
		i++;

		for (h = 0; h < SampSize; h++){
			System.out.print("Enter sample #" + h + ":");
			int sample = input.nextInt();

			if(sample > 0){
				arr3[h] = sample;
				total += sample;
				count++;
			}
			else if(sample < 0){
				arr3[h] = 0;
				total = total + sample;
				count++;
			}
			arr3[max] = total/count;

		} System.out.println();
		total = 0;
		count = 0;

		System.out.println("Enter number for Trial " + i);
		

		for (h = 0; h < SampSize; h++){
			System.out.print("Enter sample #" + h + ":");
			int sample = input.nextInt();

			if(sample > 0){
				arr4[h] = sample;
				total += sample;
				count++;
			}
			else if(sample < 0){
				arr4[h] = 0;
				total = total + sample;
				count++;
			}
			arr4[max] = total/count;
		} System.out.println();

		System.out.println("\tSample #\tTrial 1\t\tTrial 2\t\tTrial 3\t\tTrial 4"); 

		for (h = 0; h < SampSize; h++)
			System.out.println("\t" + h + "\t\t" + arr1[h] + "\t\t" + arr2[h] + "\t\t" + arr3[h] + "\t\t" + arr4[h]);           

		System.out.println("\t-------------------------------------------------------------------------------");

		System.out.println("Average: \t\t" + arr1[max] + "\t\t" + arr2[max] + "\t\t" + arr3[max] + "\t\t" + arr4[max]);

		System.out.println();

		int [] average = {arr1[max], arr2[max], arr3[max], arr4[max]}; 

		for (h = 0; h < 4; h++){
			if (average[h] < minAvrg){
				minAvrg = average[h];

			} if (average[h] > maxAvrg){  
				maxAvrg = average[h];
			}
		}

		System.out.println("Min Average: " + minAvrg);
		System.out.println("Max Average: " + maxAvrg);
		System.out.println();

		if (minAvrg == maxAvrg)
			System.out.println("The trials match EXACTLY!");


		else if (maxAvrg < 2*minAvrg)
			System.out.println("The trials concur with each other!");

		else 
			System.out.println("The trials do not concur!");

		input.close();
		return;

	}

}
