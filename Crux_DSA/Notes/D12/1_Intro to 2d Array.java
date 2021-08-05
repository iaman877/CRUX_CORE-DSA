import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		 int [][] a = new int [3][4];
		 System.out.println(a);
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(a[2]);
		 a[0][2] = 90;
		 for(int i =0;i<a[0].length;i++)// printing first row
		 {
		     System.out.println(a[0][i]+" ");
		 }
		  a[1][3]=60;
        for (int i = 0; i < a.length; i++) {   // a.length --> row
		for (int j = 0; j < a[0].length; j++) 
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
        }
	}
}
