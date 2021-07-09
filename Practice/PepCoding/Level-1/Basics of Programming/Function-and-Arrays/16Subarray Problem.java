/*
1. You are given an array of size 'n' and n elements of the same array.
2. You are required to find and print all the subarrays of the given array. 
3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.
*/
import java.io.*;
import java.util.*;
public class Main
{
public static void main(String[] args) throws Exception 
 {
   Scanner scn = new Scanner (System.in);
    int n = scn.nextInt ();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++)
     {
        arr[i] = scn.nextInt ();
     } 
    int arrSize = arr.length;
    for (int startPoint = 0; startPoint < arrSize; startPoint++)
    {
        
        for (int grps = startPoint + 1; grps <= arrSize; grps++)
          {
             for (int j = startPoint; j < grps; j++)
                {
                    System.out.print (arr[j] + "	");
                }
               System.out.println ();
    	   }
     }
    }
}
