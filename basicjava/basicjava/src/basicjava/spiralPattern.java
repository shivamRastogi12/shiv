package basicjava;

import java.io.IOException;
import java.util.Scanner;

public class spiralPattern {


	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		System.out.print("Enter the number of elements : ");
		Scanner scanner = new Scanner(System.in);
		int m= scanner.nextInt();
		int n=scanner.nextInt();
		scanner.close();	
		
        int A[][]=new int[m][n];
         int k=1, c1=0, c2=n-1, r1=0, r2=m-1;

         while(k<=m*n)
             {
                 for(int i=c1;i<=c2;i++)
                 {
                     A[r1][i]=k++;
                 }

                 for(int j=r1+1;j<=r2;j++)
                 {
                     A[j][c2]=k++;
                 }

                 for(int i=c2-1;i>=c1;i--)
                 {
                     A[r2][i]=k++;
                 }

                 for(int j=r2-1;j>=r1+1;j--)
                 {
                     A[j][c1]=k++;
                 }

              c1++;
              c2--;
              r1++;
              r2--;
              //System.out.println(A[i][j]);
             }

         /* Printing the Circular matrix */
         System.out.println("The Circular Matrix is:");
         for(int i=0;i<n;i++)
             {
                 for(int j=0;j<n;j++)
                     {
                         System.out.print(A[i][j]+ "\t");
                     }
              System.out.println();
             }
     }
 

	}


