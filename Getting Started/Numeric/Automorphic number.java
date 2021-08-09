// An automorphic number is an integer whose square ends with the given integer, as (25)2 = 625, and (76)2 = 5776.
import java.util.*;
public class Main
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String s1 = Integer.toString(number);  //Convert the number to string
		int l1 = s1.length();
		int sq = number * number;
		String s2 = Integer.toString(sq);   //Convert the number to string
		int l2 = s2.length();
		String s3 = s2.substring(l2-l1);    //Create Substring
		if(s1.equals(s3))
			System.out.println("Automorphic Number");
		else
			System.out.println("Not an Automorphic Number");
	}
}