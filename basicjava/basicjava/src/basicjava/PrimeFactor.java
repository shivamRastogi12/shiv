package basicjava;

import java.util.Scanner;

public class PrimeFactor {
	int number;
	int[] yourfactor;
	int remainder;	
	int quotient;
	PrimeFactor()
	{  		
		System.out.println("Welcome!");
		System.out.println("Enter Number : ");
		Scanner scanner = new Scanner(System.in);
		number= scanner.nextInt();
		scanner.close();	
		System.out.println("factors are : "+number);
	}	
	public void yourPrimeFactor()
	{
		for (int count=2; count < number; count++)
		{
			
			remainder= number%count;
			quotient=number/count;
			
			if(remainder == 0)
			{					
				yourfactor=new int[number];
				number=quotient;
				yourfactor[count]=count;
				System.out.println(yourfactor[count]);
			}
				
		}
		
	}	
	public static void main(String[] args) 
	{		
		PrimeFactor pf = new PrimeFactor();
		pf.yourPrimeFactor();	
	}

}
