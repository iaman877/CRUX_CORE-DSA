
/*
1. You are given a string str.
2. You are required to find the character with maximum frequency.
Input Format
A string str
Output Format
The character with highest frequency

Sample Input
zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc
Sample Output
q

*/
import java.io.*;
import java.util.*;
public class Main{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        
        int mf = 0;
        char mfch = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch) == true) 
            {
                int prevCount = map.get(ch);
                int currCount = prevCount + 1;
                map.put(ch, currCount);
            } else {
                map.put(ch, 1);
            }

            if (mf < map.get(ch)) {
                mf = map.get(ch);
                mfch = ch;
            }
        }
        System.out.println(mfch);
    }

}
