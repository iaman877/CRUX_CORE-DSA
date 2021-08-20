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