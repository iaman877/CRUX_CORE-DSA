import java.util.*;
import java.io.*;
import static java.lang.Math.sqrt;
public class Main 
{
    public static void main(String args[]) 
    {
       Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d;
        d=(b*b)-(4*a*c);
        double r1,r2;
        r1=(-b+sqrt(d))/(2*a);
        r2=(-b-sqrt(d))/(2*a);
        int first,second;
        first=(int)r1;
            second=(int)r2;
            /*
            
        if(r1>r2)
        {
            first=(int)r1;
            second=(int)r2;
        }
        else
        {
            first=(int)r2;
            second=(int)r1;
        }
        */
        if(d>0)
        {
        
            System.out.println("Real and Distinct");
            System.out.print(first +" "+ second);
        }
        if(d==0)
        {
            System.out.println("Real and Equal");
            System.out.print(first +" "+ second);
        }
        if(d<0)
        {
        
            System.out.print("Imaginary");
            
        }
    }
}
