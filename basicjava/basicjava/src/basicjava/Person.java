package basicjava;

import java.util.Scanner;

public class Person {

	static int age;
	
	Person(int initialAge)
	{
		if (initialAge>0)
		{
			age=initialAge;
		}
		else
		{
			age=0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}
	
	public void yearPasses()
	{
		age=age+1;
	}
	
	void amIOld()
	{
		if (age<13)
		{
			System.out.println("You are young");
		}
		else if (age >= 13 && age < 18)
		{
			System.out.println("You are a teenager.");
		}
		else
		{
			System.out.println("You are old.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Age : ");
        Scanner scanner = new Scanner(System.in);
        age= scanner.nextInt();
        scanner.close();        
       Person obj=new Person (age);
       obj.amIOld();      
       for (int count=1; count<=13; count++)
       {
    	   obj.yearPasses();
       }
       obj.amIOld();
	}

}
