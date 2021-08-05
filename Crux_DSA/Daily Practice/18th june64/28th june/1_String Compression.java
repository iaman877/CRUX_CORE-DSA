import java.util.*;
import java.io.*;
public class Main {
	public static void printRLE(String str)
	{
		int n = str.length();
		for (int i = 0; i < n; i++) {

			// Count occurrences of current character
			int count = 1;
			while (i < n - 1 &&
				str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			// Print character and its count
			System.out.print(str.charAt(i));
			System.out.print(count);
		}
	}

	public static void main(String[] args)
	{
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
		printRLE(str);
	}
}
