/*

Recursive program to find all Indices of a Number

Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array
Examples: 
 
Input: arr = {1, 2, 3, 2, 2, 5}, X = 2 
Output: 1 3 4 
Element 2 is present at indices 1, 3, 4 (0 based indexing)
Input: arr[] = {7, 7, 7}, X = 7 
Output: 0 1 2 

*/
 
public class All_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 8, 9, 5, 5, 89, 5, 9 };
		int ans[] = All_occ(arr, 5, 0, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] All_occ(int[] arr, int item, int i, int count) {
		if (i == arr.length) {

			return new int[count];

		}

		if (arr[i] == item) {
			count++;

			int res[] = All_occ(arr, item, i + 1, count);
			res[count-1] = i;
			return res;

		} else {
			return All_occ(arr, item, i + 1, count);
		}

	}

}