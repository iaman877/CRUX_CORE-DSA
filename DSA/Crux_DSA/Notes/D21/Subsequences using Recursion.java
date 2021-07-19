/*
Generating all possible Subsequences using Recursion
Difficulty Level : Easy
Last Updated : 02 Jul, 2021
Given an array. The task is to generate and print all of the possible subsequences of the given array using recursion.

Examples: 

Input : [1, 2, 3]
Output : [3], [2], [2, 3], [1], [1, 3], [1, 2], [1, 2, 3]

Input : [1, 2]
Output : [2], [1], [1, 2]

*/
public class Sub_seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_SubSeq("abc", "");

	}

	public static void Print_SubSeq(String Ques, String ans) {
		// TODO Auto-generated method stub
		if (Ques.length() == 0) {
			System.out.println(ans);
			 return;
		} 

			char ch = Ques.charAt(0);
			Print_SubSeq(Ques.substring(1), ans);// bc , ""   no 
			Print_SubSeq(Ques.substring(1), ans + ch);// bc, "a"   yes 
		
	}

}