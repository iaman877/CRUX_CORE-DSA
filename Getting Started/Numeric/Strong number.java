/*
Strong Number is the number whose sum of factorial of the digits in any number is equal to the given number. 
Suppose we have a number 145 then,
Factorial of all digits –
Factorial of 1 = 1 ;
Factorial of 4 = 24 ;
Factorial of 5 = 120 ;
Sum of Factorial of all digits –
1 + 24 + 120 = 145 ;
*/
import java.util.*;
public class Main
{	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fac,sum = 0;
		int n = number;
		while(n != 0)
		{	
			fac = 1;
			int r = n % 10;
			for(int i = r ; i >= 1 ; i--)
			{
			    fac = fac * i;
			}
			sum = sum + fac;
			n=n/10;
		}
		if(sum == number)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
														
	}
}