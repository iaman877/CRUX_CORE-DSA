/*
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
*/
import java.util.*;
  public class Main{
  public static void main(String[] args)
  {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int nod = 0;   // nod will used for "count the number of digit"
            int temp = n;
            while(temp != 0)
            {
                temp = temp / 10;
                nod++;
            }
            int div = (int)Math.pow(10, nod-1); //div is used to convert node ->nultiple of ten's which is one less in size
            while(div != 0)
            {
                int q = n/div;
                System.out.println(q);
                n = n%div;
                div = div/10;
            }
   }
  }

// Method 2
import java.util.*;
    public class Main
    {
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      String s=String.valueOf(n);
      for(int i=0;i<s.length();i++)
      {
          System.out.println(s.charAt(i));
      }
     }
    }
