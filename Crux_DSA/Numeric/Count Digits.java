/*
Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned.

Input Format
Integer (A number) Integer (A digit)

Constraints
0 <= N <= 1000000000 0 <= Digit <= 9

Output Format
Integer (count of times digit occurs in the number)

Sample Input
5433231 
3
Sample Output
3
Explanation
The digit can be from 0 to 9. Assume decimal numbers.In the given case digit 3 is occurring 3 times in the given number.
*/
import java.util.*;
class Main
{

static int countOccurrances(int n,int d)
{
	int count = 0;
	while (n > 0)
	{
		count = (n % 10 == d) ?count + 1 : count;
		n = n / 10;
	}
	return count;
}
public static void main(String args[])
{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int d = scn.nextInt();

	System.out.println(countOccurrances(n, d));
}
}





