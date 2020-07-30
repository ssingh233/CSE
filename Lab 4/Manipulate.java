import java.util.Scanner;


public class Manipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner (System.in);

    int a,b;

    a = input.nextInt();
	b = input.nextInt();
	
	System.out.println("The Result of plus is " +(int)(a+b)); 
	System.out.println("The Result of sub is " +(int)(a-b));
	System.out.println("The Result multiply is " +(int)(a*b));
	System.out.println("The Result divide is " +(int)(a/b));
	System.out.println("The Result percentage is " +(int)(a%b));
	
	short f,g;
	
	f = input.nextShort();
	g = input.nextShort();
	
	System.out.println("The Result of plus is " +(short)(f+g)); 
	System.out.println("The Result of sub is " +(short)(f-g));
	System.out.println("The Result multiply is " +(short)(f*g));
	System.out.println("The Result divide is " +(short)(f/g));
	System.out.println("The Result percentage is " +(short)(f%g));
	
    double m,n;
	
	m = input.nextDouble();
	n = input.nextDouble();
	
	System.out.println("The Result of plus is " +(double)(m+n)); 
	System.out.println("The Result of sub is " +(double)(m-n));
	System.out.println("The Result multiply is " +(double)(m*n));
	System.out.println("The Result divide is " +(double)(m/n));
	System.out.println("The Result percentage is " +(double)(m%n));
	
	float x,y;
	
	x = input.nextFloat();
	y = input.nextFloat();
	
	System.out.println("The Result of plus is " +(float)(x+y)); 
	System.out.println("The Result of sub is " +(float)(x-y));
	System.out.println("The Result multiply is " +(float)(x*y));
	System.out.println("The Result divide is " +(float)(x/y));
	System.out.println("The Result percentage is " +(float)(x%y));
	

	}

}
