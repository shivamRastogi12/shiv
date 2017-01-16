package basicjava;

public class conditionalAction {
	
	int n =4;
	
	public void actions()	
	{
		if (n%2!=0)
		{
			System.out.println("Number is : "+n);
			System.out.println("Weird");
		}
		else if (n%2==0 && (n >=2 && n <= 5))
		{
			System.out.println("Number is : "+n);
			System.out.println("Not Weird");
		}
		else if (n%2==0 && (n >=6 && n <= 20))
		{
			System.out.println("Number is : "+n);
			System.out.println("Not Weird");
		}
		else if (n%2==0 && n >20)
		{
			System.out.println("Number is : "+n);
			System.out.println("Weird");
		}
	}

	public static void main(String[] args) {
		conditionalAction ca = new conditionalAction();
		ca.actions();

	}

}
