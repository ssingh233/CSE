import java.util.Scanner;

public class BobcatCar {

	public BobcatCar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 Scanner input = new Scanner(System.in);

		int n1, n2, n3, n4 = 0;

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.print ("Please choose the rental car: ");
		n1 = input.nextInt();
		if (n1 < 1 || n1 > 3)
		{
			System.out.println(" Incorrent input, Enter 1 for Economy, 2 for Compact, 3 for Standard: ");
			n1 = input.nextInt();
		}
		
		System.out.print("Please enter the number of rental days: ");
		n2 = input.nextInt();
		
		System.out.print("Club member?: 1 for yes, 0 for no: ");
		n3 = input.nextInt();
		if (n3 == 1) 
		
		{ 
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
			n4 = input.nextInt(); 
		}
			System.out.println("");
		
		int Cost = 0;
		int Price =0;
		int Discount =0;
		int Count =0;
		double Member =0;
		double Total =0;
		
		if (n1 == 1)
		{
			Price = 35;
			Cost = n2*Price;
			System.out.println("Base: " + n2 + " days for a Economy @ " + Price + " per day:		   	  $ " + Cost);
			
			if (n3 == 1)
			{
				Count = n2 / 7;
				Discount = Price * Count;
				System.out.println("Club Member Discount: 					      	- $ " + Discount);
			}
			
			if (n4 == 1)
			{
				Member = Cost * .15;
				System.out.println("Platinum Executive Package: 					+ $ " + Member);
			}
			System.out.println("");
			
			Total = (Cost - Discount + Member);
			System.out.println("Total Estimate for Rental: 				 	  $ " + Total);
		}
		
		else if (n1 == 2)
		{
			Price = 45;
			Cost = n2*Price;
			System.out.println("Base: " + n2 + " days for a Economy @ " + Price + " per day:		   	  $ " + Cost);
			
			if (n3 == 1)
			{
				Count = n2 / 7;
				Discount = Price * Count;
				System.out.println("Club Member Discount: 					      	- $ " + Discount);
			}
			
			if (n4 == 1)
			{
				Member = Cost * .15;
				System.out.println("Platinum Executive Package: 					+ $ " + Member);
			}
			System.out.println("");
			
			Total = (Cost - Discount + Member);
			System.out.println("Total Estimate for Rental: 				 	  $ " + Total);
		}
		
		else if (n1 == 3)
		{
			Price = 95;
			Cost = n2*Price;
			System.out.println("Base: " + n2 + " days for a Economy @ " + Price + " per day:		   	  $ " + Cost);
			
			if (n3 == 1)
			{
				Count = n2 / 7;
				Discount = Price * Count;
				System.out.println("Club Member Discount: 					      	- $ " + Discount);
			}
			
			if (n4 == 1)
			{
				Member = Cost * .15;
				System.out.println("Platinum Executive Package: 					+ $ " + Member);
			}
			System.out.println("");
			
			Total = (Cost - Discount + Member);
			System.out.println("Total Estimate for Rental: 				 	  $ " + Total);
			
		}	
	}
}
