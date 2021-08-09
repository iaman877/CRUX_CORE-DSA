/* Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.
Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its digits or not
*/

import java.util.Scanner;
public class Main
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = number;
		int result = 0;
		while(n != 0)
		{
			int pick_last = n % 10;
			result = result + pick_last;
			n = n / 10;
		}
		
		if(number % result == 0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");

		sc.close();													
	}
}