/*

Take as input N, a number. Take N more inputs to form an array. The array contains only 0 and 1. Sort the array in a single scan.

Input Format
Enter the size of the array N and input N more numbers and store in the array

Output Format
Display the sorted array

Sample Input
5
1
1
1
0
0
Sample Output
0 0 1 1 1 

*/
import java.util.*;
import java.io.*;
public class Main
{
    public static void segregate0and1(int[] arr)
        {
        	int count = 0; 
        	for (int i = 0; i < arr.length; i++) 
        	{
        		if (arr[i] == 0)
        			count++;
        	}
        	for (int i = 0; i < count; i++)
        		arr[i] = 0;
        
        	for (int i = count; i < arr.length; i++)
        		arr[i] = 1;
        }
    public static void print(int[] arr)
    {
    	for (int i = 0; i < arr.length; i++)
    		System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) 
    	{
    	    Scanner scn = new Scanner(System.in);
    	    int n = scn.nextInt();
    	    int[] arr = new int[n];
    		for(int i = 0; i < arr.length; i++)
    		{
    		 arr[i] = scn.nextInt();
    		}
    	    segregate0and1(arr);
    	    print(arr);
    	}
}
