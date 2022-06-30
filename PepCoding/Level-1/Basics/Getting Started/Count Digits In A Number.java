/*
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.
*/

// Solution 1st 

import java.util.*;  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count = 0;
   while(n!=0)
	{
        n=n/10;
        count++;
   }
                                
    System.out.println(count);
   }
  }
// Solution 2nd
import java.util.*;
  public class Main
  {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();
    String s=String.valueOf(n);
    long counter = 0;
    for(long i =0;i<s.length();i++)
    {
        counter++;
    }
    System.out.println(counter);
   }
  }
