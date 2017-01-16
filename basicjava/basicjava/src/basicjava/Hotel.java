package basicjava;


public class Hotel {
	
	double mealPrice;
	int tipPercent, taxPercent;
	double totalbill;
	
	public Hotel()
	{
		mealPrice=12.0;
		tipPercent=20;
		taxPercent=80;
	}
	public void bill()
	{
		totalbill=12.0+(12.0*(20.0/100.0))+(12.0*(80.0/100.0));
		System.out.println("Your Total bill is : "+totalbill);		
	}
	
	public static void main(String[] args) {
		Hotel hl = new Hotel();	
		hl.bill();
	}

}
