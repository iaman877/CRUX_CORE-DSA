Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. Kartik Bhaiya describes perfectness of a string as the maximum length substring of equal characters. Kartik Bhaiya is given a number k which denotes the maximum number of characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.

Input Format
The first line contains an integer denoting the value of K. The next line contains a string having only ‘a’ and ‘b’ as the characters.

Constraints
2 ≤ N ≤ 10^6

Output Format
A single integer denoting the maximum perfectness achievable.

Sample Input
2
abba
Sample Output
4
Explanation
We can swap the a's to b using the 2 swaps and obtain the string "bbbb". This would have all the b's and hence the answer 4.
Alternatively, we can also swap the b's to make "aaaa". The final answer remains the same for both cases.


public class Kartik_bhaiya_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababbaaabaa";
		int k=2;
		int flip_b=kartikbhaiyanadString(str, 'a', k);
		int flip_a=kartikbhaiyanadString(str, 'b', k);
		System.out.println(Math.max(flip_a, flip_b));
		
		

	}

	public static int kartikbhaiyanadString(String str, char c, int k) {
		int start = 0;
		int end = 0;
		int max_len = 0;
		int flip = 0;
		while (end < str.length()) {
			if (str.charAt(end) != c) {
				flip++;
			}

			// Window km kr
			while (flip > k) {

				if (str.charAt(start) != c) {
					flip--;
				}
				start++;
			}

			// ans update
			max_len = Math.max(max_len, end - start + 1);
			end++;

		}
		return max_len;

	}

}