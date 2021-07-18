/*
Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.

Input Format
The First Line contains an Integer N, size of the array. Next Line contains N Strings separated by space.

Constraints
1 ≤ T ≤ 100 1 ≤ Length of String ≤ 8

Output Format
Print the minimum number for each String separated by a new Line.

Sample Input
4
D I DD II
Sample Output
21
12
321 
123
Explanation
For the Given sample case, For a Pattern of 'D' print a decreasing sequence which is 2 1.
*/
import java.util.Scanner;

public class Form_minimum_number_from {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	while (t > 0) {
			String str = sc.next();
			minimumnumber(str);
			t--;

		}

	}

	public static void minimumnumber(String str) {
		// TODO Auto-generated method stub
		int n = str.length();
		int ans[] = new int[n + 1];
		int count = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				for (int j = i - 1; j >= 0 && str.charAt(j) == 'D'; j--) {
					ans[j] = count;
					count++;
				}
			}

		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
		System.out.println();

	}

}