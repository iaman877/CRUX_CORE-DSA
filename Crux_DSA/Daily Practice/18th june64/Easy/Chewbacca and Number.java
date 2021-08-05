import java.util.*;
public class Main{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);	
		long n = sc.nextLong();
		System.out.println(Chewbacca(n));
	}
	public static long Chewbacca(long n) 
    {
		long ans=0;
		long mul=1;
		
		while(n>9) {
			long t = n%10;
			if(t>9-t) {
				ans = ans + (9-t)*mul;
			}
			else {
				ans= ans + t*mul;
			}
			n=n/10;
			mul=mul*10;
		}
		if(n!=9) {
			if(n>9-n) {
				n=9-n;
			}
		}
		ans = ans + n*mul;
		return ans;
	}
}
