import java.util.Scanner;
public class Main
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i < number ; i++)
		{
			if(number % i == 0)
				sum = sum + i;
		}

		if(sum > number)
		        System.out.println("Abundant Number");
		else if(sum == number)
		    	System.out.println("Perfect Number");
		else
		     System.out.println("Not an Perfect Number and Abundant Number");
													
	}
}