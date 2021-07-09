import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int y = scn.nextInt();
    int z = scn.nextInt();
    if(x > y && x > z)
    {
        System.out.println(x);
    }
    else if(y > z)
    {
        System.out.println(y);
    }
    else
    {
        System.out.println(z);
    }
    }
}
