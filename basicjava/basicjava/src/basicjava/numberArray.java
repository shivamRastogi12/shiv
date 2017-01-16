package basicjava;

import java.util.Scanner;

public class numberArray {
	

	public numberArray()
	{			
		 Scanner in=new Scanner (System.in);
	     int size;
	     System.out.println("\n Enter the size of array");
	            size=in.nextInt();
	             int arr[]=new int[size];
	             int i;
	             for (i=0;i<arr.length;i++) 
	             {
	                 System.out.println("Input Array elements :"+i);
	                 arr[i]=in.nextInt();
	                 
	             }
	             int temp = 0;  
	              for( i=0; i < arr.length; i++)
	                       {  
	                      for(int j=1; j < arr.length; j++)
	                      {  
	                               if(arr[j-1] > arr[j])
	                               {  
	                                      //swap elements  
	                                      temp = arr[j-1];  
	                                      arr[j-1] = arr[j];  
	                                      arr[j] = temp;  	                                      
                              }  	                                   
	                      }  	                      
	}
	              in.close();
	              System.out.println("Sorted Array is : ");
	              for(i=0;i<arr.length;i++)
	                  System.out.println(arr[i]);

	}
        

	public static void main(String[] args) 
	{
		numberArray obj = new numberArray();


	}

}
