import java.util.Scanner;
public class Main
{										
    public static void main(String[] args)
    {									
        char c;
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is an Alphabet");
		else
			System.out.println(c + " is not an Alphabet");
		sc.close();			                               //closing scanner class(not compulsory, but good practice)
	}