/*
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
*/
import java.util.*;
    public class Main
    {
        public static void main(String[] args)
            {
                Scanner scn = new Scanner(System.in);
                 int n = scn.nextInt();
                 for(int i =n;i >= 1;i--)
                    {
                        for(int j = 1;j<=i;j++)		//MAGIC LOOP
                            {
                                System.out.print("*\t");
                            }
                            System.out.println();
                     }
            }
    }
 
