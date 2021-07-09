import java.util.*;
class Main {
	
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int minc = 0;
	    int minr = 0;
	    int n = scn.nextInt();
	    int m = scn.nextInt();
	    int arr[][] = new int[n][m];
	    int maxr = arr.length-1;
	    int maxc = arr[0].length-1;
	    int cnt = 0;
	    int tne = n*m;
	    while(cnt<tne)
	    {
	        // left wall
	        for(int i = minr, j = minc ; i<maxr && cnt<tne ; i++)
	        {
	            System.out.println(arr[i][j]);
	            cnt++;
	        }
	        minc++;
	        // bottom wall
	        for(int i = maxr, j = minc ; i<=maxc && cnt<tne ; j++)
	        {
	            System.out.println(arr[i][j]);
	            cnt++;
	        }
	        maxr++;
	        // right wall
	       for(int i = maxr, j = minc ; i>=minc && cnt<tne ; i--)
	        {
	            System.out.println(arr[i][j]);
	            cnt++;
	        }
	        maxc--; 
	        // top wall 
	         for(int i = minr, j = maxc ; i>=minc && cnt<tne ; j--)
	        {
	            System.out.println(arr[i][j]);
	            cnt++;
	        }
	        minr++;
	    }
	}
}
