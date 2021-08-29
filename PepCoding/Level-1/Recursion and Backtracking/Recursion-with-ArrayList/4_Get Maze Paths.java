/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
A number m
Output Format
Contents of the arraylist containing paths as shown in sample output
Constraints
0 <= n <= 10
0 <= m <= 10
Sample Input
3
3
Sample Output
[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
*/

import java.util.*;
public class GetMazePaths {

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

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > temp = new ArrayList < > ();
            temp.add("");
            return temp;
        }
        if (sr > dr || sc > dc) {
            ArrayList < String > temp = new ArrayList < > ();
            return temp;
        }

        ArrayList < String > smallres1 = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList < String > smallres2 = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList < String > answer = new ArrayList < > ();

        for (int i = 0; i < smallres1.size(); i++) {
            answer.add("h" + smallres1.get(i));
        }

        for (int i = 0; i < smallres2.size(); i++) {
            answer.add("v" + smallres2.get(i));
        }

        return answer;
    }

}
