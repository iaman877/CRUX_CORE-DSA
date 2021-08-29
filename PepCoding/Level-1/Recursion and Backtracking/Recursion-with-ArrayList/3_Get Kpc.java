/*
1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Contents of the arraylist containing words as shown in sample output
Constraints
0 <= str.length <= 10
str contains numbers only
Sample Input
78
Sample Output
[tv, tw, tx, uv, uw, ux]
*/


import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        ArrayList < String > ans = getKPC(st);
        System.out.println(ans);
        scn.close();
    }

    static String[] keypad = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };

    public static ArrayList < String > getKPC(String str) {

        if (str.length() == 0) {
            ArrayList < String > temp = new ArrayList < > ();
            temp.add("");
            return temp;
        }
        // let 673
        char fChar = str.charAt(0); // 6 as a string
        String rs = str.substring(1);   // 73
        String value = keypad[fChar - '0'];   //fChar - '0' =  6th index
        ArrayList < String > preResult = getKPC(rs);     // remaining call on 73 
        ArrayList < String > result = new ArrayList < > ();

        for (int i = 0; i < value.length(); i++) {  // -> p,q,r,s
            char ch = value.charAt(i);
            for (int j = 0; j < preResult.size(); j++) {    // 73 ki string
                result.add(ch + preResult.get(j));
            }
        }
        return result;
    }
}
