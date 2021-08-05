/*
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
*/
import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) 
        {
            int n = scn.nextInt();
                int div = 2;
                while (div * div <= n) 
                {
                    if (n % div == 0) 
                    {
                        break;
                    }
                    div++;
            	}
                if (div * div > n) 
                {
                    System.out.println("prime");
                } 
                else 
                {
                    System.out.println("not prime");
                }
            }
                                
    	}
    }
