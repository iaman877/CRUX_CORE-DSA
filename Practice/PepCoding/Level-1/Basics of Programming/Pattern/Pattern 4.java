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
           int n  = scn.nextInt();
           int space = 0,star = n; 
           for(int i =1; i<=n;i++)
             {
                for(int j = 1;j<=space;j++)   
                 {                            
                    System.out.print("	");  
                 }
                for(int j = 1;j<=star;j++)   
                  {
                     System.out.print("*	"); 
                  }
                    space++;                   
                    star--;                     
                    System.out.println();      
              }
        }
}
