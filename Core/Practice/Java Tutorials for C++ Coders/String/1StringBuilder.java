import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
 public class Main {
    public static void main(String[] argv)
    {
        StringBuilder sb = new StringBuilder("hello ");
        System.out.println(sb);
        char ch = sb.charAt(0);     //get
        System.out.println(ch);
        sb.setCharAt(0,'D');       // set
        System.out.println(sb);
        sb.insert(1,'y');          // insert
        System.out.println(sb);
        sb.deleteCharAt(1);        // remove
        System.out.println(sb);
        sb.append("Worid");       // append
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
