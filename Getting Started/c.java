// Consecutive number of an array 
import java.util.*;
public class Main
{
	public static void main(String args[]){
	int arr[]= {78, 80, 81, 79}; 
    int n = arr.length;
	System.out.println(checkConsecutive(arr,n));
	
 }
	public static int checkConsecutive(int arr[],int n){
	Arrays.sort(arr);
	int count=0;
	for(int i=0;i<n-1;i++){
		if(arr[i+1]==arr[i]+1){
			count++;
		}
	}
	if(count==n-1){
		  return 1;
	}else{
		 return 0;
	}
}
}
// ---------------------------------
// Ap Gp and Fibonaci
import java.util.*;
class Main 
{
	
    public static int solution(int a[], int n)
	{   
         // AP 
         boolean ap = true;
         int diff = a[1]-a[0];

         for(int i=1;i<n;i++)
         {
             if(diff!=(a[i]-a[i-1]))
             {
                 ap = false;
                 break;
             }
         }
         
         if(ap)
         {
             return a[n-1]+diff;
         }
         
         // GP
            
             if(a[0]!=0)
             {
                double r = a[1]/a[0];

                boolean gp = true;

              for(int i=1;i<n;i++)
             {   
              if(a[i]==0)
              {
                gp = false;
                break;
              }
               else if(r!=(a[i]/a[i-1]))
               {
                gp = false;
                break;
               }
              }
              if(gp)
              {
                  return (int)(a[n-1]*r);
              }
             }
        
         
         // fib
         return a[n-1]+a[n-2];
    
	}
		      
	public static void main (String[] args)
	{
		int arr[] = {2,4,8,16};
		int n = arr.length;
        int[] ans = new int[1];
		
        System.out.println(solution(arr, n));
	}

}
// -------------------------------------------
// String anagram
import java.util.*;
class Main 
{
	
    public static String solution(String s, String t)
	{   
        
            if(s.length() != t.length()){
                return "no";
            }
            
            HashMap<Character, Integer> m1 = new HashMap<>();
            HashMap<Character, Integer> m2 = new HashMap<>();
            
            for(int i=0;i<s.length();i++)
            {
                if(m1.containsKey(s.charAt(i)))
                {
                    m1.put(s.charAt(i),m1.get(s.charAt(i))+1);
                }
                else
                {
                    m1.put(s.charAt(i),1);
                }
            }

            for(int i=0;i<t.length();i++)
            {
                if(m2.containsKey(t.charAt(i)))
                {
                    m2.put(t.charAt(i),m2.get(t.charAt(i))+1);
                }
                else
                {
                    m2.put(t.charAt(i),1);
                }
            }

            if(m1.equals(m2))
            {
                return "yes";
            }
            return "no";
        }   
		      
	public static void main (String[] args)
	{
		String a = "dog";
        String b = "gog";
		
        System.out.println(solution(a,b));
	}
}
