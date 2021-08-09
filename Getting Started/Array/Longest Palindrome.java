/* Longest palindrome in an array.
Here we find the longest palindrome number from the given array. So here we need to sort the array 
in ascending order and later check from the last that the given number is palindrome or not.

The reason behind to sort an array is, we want the longest palindrome number so, in the sorted array,
we got the largest number from the last element of the array, and check this is a palindrome or not 
and check till starting element. If there is no palindrome number so return -1 and print that there is no palindrome number.

*/
import java.util.*;
public class Main
{
    public static boolean check_palindrome(int n)
    {
       int div = 1;
       while (n / div >= 10)
       div *= 10;
       while (n != 0)
      {
          int first = n / div;
          int last = n % 10;
          if (first != last)
             return false;
                  // Removing the leading and trailing digits from the number
          n = (n % div) / 10;
              // Reducing divisor by a factor of 2 as 2 digits are dropped
          div = div / 100;
      }
      return true; 
    }
    public static int large_palindrome(int A[], int n)
    {
        Arrays.sort(A);
        for (int i = n-1; i >= 0; --i) 
           {
               if (check_palindrome(A[i]))
               return A[i];
           }
          return -1;
    }
    public static void main (String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int num,i;
       num = sc.nextInt();
       int a[] = new int[num];
       for(i=0; i<num; i++)
       {
          a[i] = sc.nextInt();
       }
       System.out.print(large_palindrome(a,num));
    }
}
