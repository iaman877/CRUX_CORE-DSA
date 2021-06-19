import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int original1 = n1;
    int original2 = n2;
    while(n1 % n2 != 0)
       {
           int rem = n1 % n2;
           n1 = n2;
           n2 = rem;
       }
       int gcd = n2;
       int LCM  = (original1 * original2)/gcd;
       System.out.println(LCM);
    }
}
