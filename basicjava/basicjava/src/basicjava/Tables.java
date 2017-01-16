package basicjava;

public class Tables {
	
	Tables()
	{
		int result;
		for (int num=1; num<=30; num++ )
		{
			for (int multiplier=1; multiplier<=10; multiplier++)
			{
				result=num*multiplier;
				System.out.println(+num+ " X " +multiplier+ " = "+result);
			}
			System.out.println("-----------------------------------------------------------------------");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tables tb = new Tables();

	}

}
