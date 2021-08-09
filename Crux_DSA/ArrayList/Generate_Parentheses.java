/*
Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
*/

import java.util.ArrayList;

public class Generate_Parentheses {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		GenerateParentheses(3, 0, 0, "",list );
		System.out.println(list);

	}

	public static void GenerateParentheses(int n, int nop, int noc, String ans,ArrayList<String> list ) {
		if (nop == n && noc == n) {
			list.add(ans);
			return;
		}

		// opening
		if (nop < n) {
			GenerateParentheses(n, nop + 1, noc, ans + "(",list);
		}
		// closing
		if (noc < nop) {
			GenerateParentheses(n, nop, noc + 1, ans + ")",list);
		}

	}
}