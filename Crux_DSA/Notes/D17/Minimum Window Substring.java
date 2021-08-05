/*
Minimum Window Substring
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
*/
public class Minimum_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(MinimumWindon(s, t));

	}

	public static String MinimumWindon(String s, String t) {
		int freq_t[] = new int[256];
		int freq_s[] = new int[256];
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freq_t[ch]++;

		}

		int count = 0;
		int start = 0;
		int min_len = Integer.MAX_VALUE;// 2^31-1
		int start_Index = -1;

		for (int end = 0; end < s.length(); end++) {
			char ch = s.charAt(end);
			freq_s[ch]++;
			if (freq_s[ch] <= freq_t[ch]) {
				count++;
			}
			if (count == t.length()) {
				while (freq_s[s.charAt(start)] > freq_t[s.charAt(start)] || freq_t[s.charAt(start)] == 0) {

					if (freq_s[s.charAt(start)] > freq_t[s.charAt(start)]) {
						freq_s[s.charAt(start)]--;
					}
					start++;
				}

				if (min_len > end - start + 1) {
					min_len = end - start + 1;
					start_Index = start;
				}

			}

		}
		if (start_Index == -1) {
			return "";
		}
		return s.substring(start_Index, start_Index + min_len);

	}

}