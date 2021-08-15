/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A , print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
       int count = 0;
        for(int i=0; i<A.length()/2;i++)
        {
           if( A.charAt(i) == A.charAt(A.length()-i-1)) 
                       count++;   
        }
        System.out.println((count == A.length()/2) ? "Yes" : "No") ;    
    }        
}



