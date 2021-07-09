/* Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. The scheme is as follows, each car will be allowed to run on Sunday 
if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above 
criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?
Sample Input
2
12345
12134
Sample Output
Yes
No
Explanation
1 + 3 + 5 = 9 which is divisible by 3
1 + 1 + 3 = 5 which is NOT divisible by 3 and 2+4 = 6 which is not divisble by 4.
*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int []a=new int[n];
	        int i=0;
	        while(i<n)
	        {
	        	a[i]=sc.nextInt();
	        	i++;
	        }
	        i=0;
	        while(i<n)
	        {
	        	boolean b=checkCar(a[i]);
	        	if(b==true)
	        		System.out.println("Yes");
	        	else
	        		System.out.println("No");
	        	i++;
	        }
	    }
	    	public static boolean checkCar(int num)
		{
			int s=0,r;
			int evensum=0,oddsum=0;
			
			while(num!=0)
			{
				r=num%10;
				if((r&1)!=0)
				{
					oddsum=oddsum+r;
				}else
				{
					evensum=evensum+r;
				}
				num=num/10;
			}
			if(oddsum%3==0||evensum%4==0)
			{
				return true;
			}
			else
			{
				return false;
			}
    }
}
