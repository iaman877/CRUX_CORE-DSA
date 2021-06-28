import java.util.*;
class Main{
// Function to check if the given array forms an increasing decreasing  sequence or vice versa

static boolean canMake(int n, int ar[])
{
	if (n == 1)
		return true;
	else
	{
		if (ar[0] < ar[1])  // First subarray is stricly increasing
		{

			int i = 1;
			while (i < n && ar[i - 1] < ar[i])  // Check for strictly increasing condition & find the break point
			{
				i++;
			}
			while (i + 1 < n && ar[i] > ar[i + 1])  // Check for strictly decreasing condition & find the break point
			{
				i++;
			}
			if (i >= n - 1)    // If i is equal to length of array
				return true;
			else
				return false;
		}
		else if (ar[0] > ar[1])   // First subarray is  strictly Decreasing
		{
			int i = 1;

			
			while (i < n && ar[i - 1] > ar[i])  // Check for strictly  increasing condition & find the break point
			{
				i++;
			}

			while (i + 1 < n && ar[i] < ar[i + 1])  // Check for strictly increasing condition  & find the break point
			{
				i++;
			}

			if (i >= n - 1)    // If i is equal to  length of array - 1
				return true;
			else
				return false;
		}

		// Condition if ar[0] == ar[1]
		else
		{
			for (int i = 2; i < n; i++)
			{
				if (ar[i - 1] <= ar[i])
					return false;
			}
			return true;
		}
	}
}

// Driver Code
public static void main(String[] args)
{
	// Given array arr[]
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	for(int i =0; i<n;i++)
	{
	     arr[i] = scn.nextInt();
	}
	// Function Call
	if (!canMake(n, arr)) {
		System.out.print("true");
	}
	else
	{
		System.out.print("false");
	}
}
}


