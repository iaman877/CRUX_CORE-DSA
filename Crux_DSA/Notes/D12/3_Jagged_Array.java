import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		int[][] arr = new int[4][];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 2];
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");     // new array 
			}
			System.out.println();
		}
	}
}
