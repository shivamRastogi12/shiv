package basicjava;

import java.util.Scanner;

public class binaryConversion 
{
		 
	
	public static void main(String[] args) 
	{
		System.out.println("Input Number : ");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = Integer.toBinaryString(n);
        
        char[] c = str.toCharArray();
        
        int max = 0;
        int num = 0;
        int i=0;
        while(i<c.length)
            {
            if(c[i] == '1')
                {
                num++;
            } else {
                num = 0;
            }
            
            if(max < num)
                {
                max = num;
            }
            i++;
        }
        System.out.println("Output : "+max);
	}
}
