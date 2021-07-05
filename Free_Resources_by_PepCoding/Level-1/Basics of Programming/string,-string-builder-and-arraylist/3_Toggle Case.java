/*
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.
*/
import java.io.*;
import java.util.*;

public class Main {

    public static String toggleCase(String str) {

        int len = str.length();
        StringBuilder ans = new StringBuilder("");

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char uppercase = (char) (ch - 'a' + 'A');
                ans.append(uppercase);
            } else {
                char lowercase = (char) (ch - 'A' + 'a');
                ans.append(lowercase);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}
