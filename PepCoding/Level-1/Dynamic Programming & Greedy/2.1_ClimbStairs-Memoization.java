import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cp = countPaths(n, new int[n+1]);
        System.out.println(cp);
    }
    public static int countPaths(int n, int[] qb)
    {
        if(n == 0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }
        int nm1 = countPaths(n-1, qb);
        int nm2 = countPaths(n-2, qb);
        int nm3 = countPaths(n-3, qb);
        int cp = nm1 + nm2 + nm3;
        qb[n] = cp;
        return cp;
    }
}
