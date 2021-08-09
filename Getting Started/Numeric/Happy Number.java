/*
A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1. 
Examples : 
Input: n = 19
Output: True
19 is Happy Number,
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 19 is a Happy Number.

Input: n = 20
Output: False

*/
import java.util.*;
public class Main
{
  public static int checkHappyNumber (int number)
   {
      int rem = 0, sum = 0;
      // calculate the sum of squares of each digits
        while(number > 0)
           {
                 rem = number %10;
                 sum = sum+(rem*rem);
                 number = number/10;
           }
           return sum;
    }
  public static void main(String[] args)
   {
      Scanner sc = new Scanner (System.in);
      int number = sc.nextInt( );
      int result = number;
      while (result != 1 && result != 4)
      {
          result = checkHappyNumber(result);
      }
      if (result ==1)
        {
          System.out.println ("It is a Happy Number");
        }
        else
          {
              System.out.println (" It is not a Happy Number");
          }
   }
}