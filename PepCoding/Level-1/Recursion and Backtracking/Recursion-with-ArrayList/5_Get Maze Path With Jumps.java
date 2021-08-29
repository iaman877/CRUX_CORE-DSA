/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
A number m
Output Format
Contents of the arraylist containing paths as shown in sample output
Sample Input
2
2
Sample Output
[h1v1, v1h1, d1]
*/
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int sr = 0;
        int sc = 0;
        int dr = n - 1;
        int dc = m - 1;
        ArrayList < String > ans = getMazePaths(sr, sc, dr, dc);
        System.out.println(ans);
        scn.close();
    }

    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > temp = new ArrayList < > ();
            temp.add("");
            return temp;
        }

        ArrayList < String > answer = new ArrayList < > ();

        for (int j = 1; j <= dc - sc; j++) {
            ArrayList < String > smallres1 = getMazePaths(sr, sc + j, dr, dc);  // horizontal
            for (int i = 0; i < smallres1.size(); i++) {
                answer.add("h" + j + smallres1.get(i));
            }
        }

        for (int j = 1; j <= dr - sr; j++) {
            ArrayList < String > smallres2 = getMazePaths(sr + j, sc, dr, dc);    // verical
            for (int i = 0; i < smallres2.size(); i++) {
                answer.add("v" + j + smallres2.get(i));
            }
        }

        for (int j = 1; j <= Math.min(dc - sc, dr - sr); j++) {                   // diagonal 
            ArrayList < String > smallres3 = getMazePaths(sr + j, sc + j, dr, dc);
            for (int i = 0; i < smallres3.size(); i++) {
                answer.add("d" + j + smallres3.get(i));
            }
        }

        return answer;
    }

}
