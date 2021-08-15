/*
trim()is a built-in function that eliminates leading and trailing spaces. The Unicode value of space character is '\u0020'. 
The trim() method in java checks this Unicode value before and after the string, if it exists then removes the spaces and returns the omitted string
Here + means it will include more alphabet if exist.
Here ^ means not 
Means if there is no alphabetical character means if we getting space then split it. 

Sample Input :
He is a very very good boy, isn't he?
Sample Output :

10
He
is
a
very
very
good
boy
isn
t
he
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s=scan.nextLine();
       //Complete the code
       if (s.trim().length()==0 || s.trim().length()>400000)
       {
         System.out.println(0);
         return;
       }
       String words[]=s.trim().split("[ !,?.\\_'@]+");
       System.out.println(words.length);
       for (String word:words)
          System.out.println(word);
    }
} 

