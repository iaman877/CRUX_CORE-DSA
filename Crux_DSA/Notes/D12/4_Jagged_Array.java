import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		int [][] jagged = takeinput();
		Displace(jagged);

	}
	public static int[][] takeinput() 
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int[][] jagged = new int[row][];
		for (int i = 0; i < jagged.length; i++) 
		  {
    			int col = sc.nextInt();
    			jagged[i] = new int[col];
    			for (int j = 0; j < jagged[i].length; j++)
    			{
    				jagged[i][j] = sc.nextInt();
		    	}
		  }
		  return jagged;
	}
	public static void Displace(int[][] arr) 
    	{
    		for (int i = 0; i < arr.length; i++) 
    		   {
    		    	for (int j = 0; j < arr[i].length; j++) 
    		    	{
    				   System.out.print(arr[i][j] + " ");
    		    	}
    	    	System.out.println();
    		  }
    	}
}
