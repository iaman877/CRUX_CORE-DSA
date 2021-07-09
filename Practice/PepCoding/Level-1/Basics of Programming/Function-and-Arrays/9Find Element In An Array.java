/*
1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
*/
import java.util.*;
import java.io.*;
public class Main
    {
        public static void main (String[]args)
            {
                Scanner scn = new Scanner (System.in);
                int n = scn.nextInt ();	//taking input size of array
                int[] arr = new int[n];	//array declaration
                for (int i = 0; i < n; i++)
                    {
                        arr[i] = scn.nextInt ();	
                    }
                    int data = scn.nextInt ();	
                    int idx = -1; 
                    for (int i = 0; i < arr.length; i++)
                      {
                        if (arr[i] == data)
                          {
                            idx = i;
                            break;
                          }
                    }
                System.out.println (idx);	// it prints the index if number is present, else -1.
        }
    }
