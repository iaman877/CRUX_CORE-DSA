/* Repeating element of an array
Example
Input: a[]= { 1,2,5,2,6,7,5 }
Output: 2,5
There is two number which has more than one frequency.
so there is two number which is repeated.
*/
import java.util.Scanner;
 class Main
{
public static void Repeating(int a[],int n)
{
     int count;
     for(int i=0;i<n;i++)
     {
        count=0;
        for (int j = i+1; j < n; j++)
        {
              if(a[i]==a[j] && i!=j)
              System.out.print(a[i]+" ");
        }
     }
}
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     int[] a=new int[size];
     for(int i=0;i<size;i++)
        {
           a[i]=sc.nextInt();
        }
     Repeating(a,size);
 }
}


// not working
