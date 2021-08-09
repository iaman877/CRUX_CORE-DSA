/*
Suppose a number is 407 ;
Cubes of its digits are :
Cube of 4 = 64 ;
Cube of 0 = 0 ;
Cube of 7 =  343 ;
Sum of all digit’s cube : 64 + 0 + 343 =407
*/
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int n, sum;
		for(int i = start ; i <= end ; i++)
		{
			n = i;
			sum = 0;
			while(n != 0)
			{
				int pick_last = n % 10;
				sum = sum + (pick_last * pick_last * pick_last);
				n = n / 10;
			}
			if(sum == i)
				System.out.print(i+ " ");
		}
	}
}
