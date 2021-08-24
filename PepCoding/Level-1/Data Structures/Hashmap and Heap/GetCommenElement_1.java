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
public class Main {
    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int[] a1 = new int[scn.nextInt()];
        for(int i=0;i<a1.length;i++)
        {
            a1[i] = scn.nextInt();
        }
        int[] a2 = new int[scn.nextInt()];
        for(int i=0;i<a2.length;i++) {
            a2[i] = scn.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a1.length;i++)
        {
            int num = a1[i];
            if(map.containsKey(num) == true) 
            {                                      // this loop will increase count
                int val = map.get(num);
                val++;
                map.put(num, val);
            }
            else {                // put as it is and mark 1 
                map.put(num, 1);
            }
        }
        for(int i=0;i<a2.length;i++) {
            int num = a2[i];
            if(map.containsKey(num)) {
                System.out.println(num);
                map.remove(num);            // becuase it will not print again 
            }
        }
    }

}
