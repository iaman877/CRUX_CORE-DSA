/*
1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            int original_no1 = n1;
            int original_no2 = n2;
            while(n1 % n2 != 0)
            {	
                int remainder = n1 % n2;
                n1 = n2;
                n2 = remainder;
            }
                int gcd = n2;
                int lcm = (original_no1 * original_no2)/gcd;
                System.out.println(gcd);		
                System.out.println(lcm);
        }
}
