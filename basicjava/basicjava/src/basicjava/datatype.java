package basicjava;

public class datatype {

	
	datatype()
	{
		byte b = 2;
		short s = 3;
		int i;
		long l;
		char c = 'a';
		float fl = 5.3f;
		double d = 7.89;
		boolean bo=true;
		
		i = b*s;
		System.out.println("Multiplication of byte " +b+ " and short " +s+ " is integer " +i);
		
		l= (long) (c+fl);
		System.out.println("Multiplication of char " +c+ " and float " +fl+ " is long " +l);
		
		if (bo==true)
		{
			System.out.println("Boolean is set to : " +bo);
		}
		else
		{
			System.out.println("double is " +d);
		}
	}
	public static void main(String[] args) {
		datatype obj = new datatype();

	}

}
