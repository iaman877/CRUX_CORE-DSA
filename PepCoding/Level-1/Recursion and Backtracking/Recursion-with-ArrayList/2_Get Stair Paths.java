/*
Get Stair Paths
Easy  Prev   Next
1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format
A number n
Output Format
Contents of the arraylist containing paths as shown in sample output

Sample Input
3
Sample Output
[111, 12, 21, 3]

*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        ArrayList<String>paths = getStairPaths(n);
        System.out.println(paths);
    }
    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0)
        {
            ArrayList<String>bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0)
        {
            ArrayList<String>bres = new ArrayList<>();
            return bres;
        }
        ArrayList < String > smallres1 = getStairPaths(n - 1);
        ArrayList < String > smallres2 = getStairPaths(n - 2);
        ArrayList < String > smallres3 = getStairPaths(n - 3);

        ArrayList < String > ans = new ArrayList < > ();

        for (int i = 0; i < smallres1.size(); i++) {
            ans.add("1" + smallres1.get(i));
        }
        for (int i = 0; i < smallres2.size(); i++) {
            ans.add("2" + smallres2.get(i));
        }

        for (int i = 0; i < smallres3.size(); i++) {
            ans.add("3" + smallres3.get(i));
        }

        return ans;
    }

}
