// without usng inbuilt function 
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		int length=0;
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // method 1
        for (char c1 : s.toCharArray()) 
			length++;
		System.out.println(length);
		// method 2
		System.out.println(s.lastIndexOf(""));
		// method 3
		System.out.println(s.toCharArray().length);
	}

}