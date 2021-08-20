import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int[] a1 = new int[scn.nextInt()];
        for(int i=0;i<a1.length;i++) {
            a1[i] = scn.nextInt();
        }

        int[] a2 = new int[scn.nextInt()];
        for(int i=0;i<a2.length;i++) {
            a2[i] = scn.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a1.length;i++) {
            int num = a1[i];
            if(map.containsKey(num) == true) {
                int old = map.get(num);
                int newv = old+1;
                map.put(num, newv);
            }
            else {
                map.put(num, 1);
            }
        }

        for(int i=0;i<a2.length;i++) {
            int num = a2[i];
            if(map.containsKey(num) && map.get(num)>0) {
                System.out.println(num);
               // map.remove(num); or 
               int old = map.get(num);
                int newv = old-1;
                map.put(num, newv);
            }
        }
    }

}