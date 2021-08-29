/*
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Contents of the arraylist containing subsequences as shown in sample output

Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> res = gss(str);
		System.out.println(res);
    }

    public static ArrayList < String > gss(String str) {

        if (str.length() == 0) {
            ArrayList < String > temp = new ArrayList < > ();
            temp.add("");
            return temp;
        }

        char fc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList < String > smallans = gss(ros);
        ArrayList < String > result = new ArrayList < > ();

        for (int i = 0; i < smallans.size(); i++) {
            result.add("" + smallans.get(i));
        }

        for (int i = 0; i < smallans.size(); i++) {
            result.add(fc + smallans.get(i));
        }

        return result;
    }
}
