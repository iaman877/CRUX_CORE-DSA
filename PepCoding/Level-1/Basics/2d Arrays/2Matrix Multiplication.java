/*
1. You are given a number n1, representing the number of rows of 1st matrix.
2. You are given a number m1, representing the number of columns of 1st matrix.
3. You are given n1*m1 numbers, representing elements of 2d array a1.
4. You are given a number n2, representing the number of rows of 2nd matrix.
5. You are given a number m2, representing the number of columns of 2nd matrix.
6. You are given n2*m2 numbers, representing elements of 2d array a2.
7. If the two arrays representing two matrices of dimensions (n1 * m1 and n2 * m2) can be multiplied, display the contents of prd array as specified in output Format.
8. If the two arrays can't be multiplied, print "Invalid input".
*/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r1 = scn.nextInt();
		int c1 = scn.nextInt();
		int[][] one = new int[r1][c1];
		for(int i =0; i<one.length;i++)
		{
		    for(int j =0;j <one[0].length;j++)
		    {
		        one[i][j] = scn.nextInt();
		    }
		}
		
    		int r2 = scn.nextInt();
    		int c2 = scn.nextInt();
    		int[][] two = new int[r2][c2];
    		for(int i =0; i<two.length;i++)
    		{
    		    for(int j =0;j <two[0].length;j++)
    		    {
    		        two[i][j] = scn.nextInt();
    		    }
    		}
		
    		if(c1 !=  r2)
    		{
    		    System.out.println("Invalid input");
		    return;
    		}
		
    		int[][] prd = new int[r1][c2];
    		for(int i = 0;i< prd.length;i++)
    		{
    		    for(int j= 0;j<prd[0].length;j++)
    		    {
    		        for(int k = 0; k< c1; k++)
    		        {
    		            prd[i][j] += one[i][k] * two[k][j];
    		        }
    		    }
    		}
		
    		for(int i = 0;i< prd.length;i++)
    		{
    		    for(int j= 0;j<prd[0].length;j++)
    		    {
    		       System.out.print(prd[i][j] + " ");
    		    }
    		    System.out.println();
    		}
	}
}
