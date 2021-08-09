/*  
An anagram of a string is another string that contains the same characters, only the order of 
characters can be different. For example, “abcd” and “dabc” are an anagram of each other.
*/
import java.util.Arrays;
import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
      Scanner scn = new Scanner(System.in);
      String str1 = scn.nextLine();
      String str2 = scn.nextLine();
    
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();

     if(str1.length() == str2.length()) 
      {
          
         char[] charArray1 = str1.toCharArray();
         char[] charArray2 = str2.toCharArray();

         Arrays.sort(charArray1);
         Arrays.sort(charArray2);
         boolean result = Arrays.equals(charArray1, charArray2);
         if(result)
          {
              System.out.println("anagram");
          }
         else 
             {
                System.out.println("not anagram");
             }
       }
      else 
      {
        System.out.println("not anagram");
      }
  }
}
