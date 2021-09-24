/*
Ex:
N= 10
K = 4

So sum is 1+2+3+5+6+7+9+10
*/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int sum =0;
		for(int i =0; i<n;i++)
		{
		    if(i%k != 0)
		      sum = sum +i;
		    else 
		      continue;
		}
		System.out.println(sum);
		
	}
}

/*
Input n= 4 ... So output is ...

1
1 + 2
1 + 2 +3
1+2+3+4 

= 20
*/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum =0;
		for(int i = 1; i<=n; i++)
		     for(int j =1; j<=i; j++)
		        sum += j;
		 System.out.println(sum);
	}
}
/*
A Boolean Matrix Question
Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1. 
*/
// Java Code For A Boolean Matrix Question
import java.util.*;
import java.io.*;
class Main
{
	public static void modifyMatrix(int mat[ ][ ], int R, int C)
	{
		int row[ ]= new int [R];
		int col[ ]= new int [C];
		int i, j;
	
		/* Initialize all values of row[] as 0 */
		for (i = 0; i < R; i++)
		{
		row[i] = 0;
		}
	
	
		/* Initialize all values of col[] as 0 */
		for (i = 0; i < C; i++)
		{
		col[i] = 0;
		}
	
	
		/* Store the rows and columns to be marked as 1 in row[] and col[] arrays respectively */
		for (i = 0; i < R; i++)
		{
			for (j = 0; j < C; j++)
			{
				if (mat[i][j] == 1)
				{
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
	
		/* Modify the input matrix mat[] using the above constructed row[] and col[] arrays 
		for (i = 0; i < R; i++)
		{
			for (j = 0; j < C; j++)
			{
				if ( row[i] == 1 || col[j] == 1 )
				{
					mat[i][j] = 1;
				}
			}
		}
	}
	
	/* A utility function to print a 2D matrix */
	public static void printMatrix(int mat[ ][ ], int R, int C)
	{
		int i, j;
		for (i = 0; i < R; i++)
		{
			for (j = 0; j < C; j++)
			{
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		int mat[ ][ ] = { {1, 0, 0, 1},
						{0, 0, 1, 0},
						{0, 0, 0, 0},};
					
				System.out.println("Matrix Initially");
				printMatrix(mat, 3, 4);
				modifyMatrix(mat, 3, 4);
				System.out.println("Matrix after modification n");
				printMatrix(mat, 3, 4);
	}
}



