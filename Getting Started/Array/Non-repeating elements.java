/* 
Example
Input: a[]= { 1,2,5,2,6,7,5 }
Output: 1,6,7
There is three number which has one frequency.
so there is three number which is not repeated.
*/
import java.util.Scanner;
public class Main
{
      public static void NonRepeating(int a[],int n)
      {
         int count;
         for(int i=0;i<n;i++)
         {
             count=0;
             //initialise the for loop for checking the elenemnt which are not repeated)
             for (int j = 0; j < n; j++)
             {
                  //check the condition if any number is same so incre
                if(a[i]==a[j] && i!=j)
                       count++;
             }
            //if count became zero so print the current element
          if(count==0)
              System.out.print(a[i]+" ");
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
          NonRepeating(a,size);
       }
}