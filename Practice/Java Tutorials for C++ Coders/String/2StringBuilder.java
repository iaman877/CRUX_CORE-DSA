import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
 public class Main {
    public static void main(String[] argv)
    {
        int n = 10000;
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
