// Sorting first half in ascending order and second half in descending order
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        int j=0,i=0, temp;
        Scanner sc=new Scanner(System.in);
        int len = sc.nextInt();
        int arr[]=new int[len];
        for( i=0;i < len;i++)
        {
            arr[i]=sc.nextInt();
        }
   //------------------------------------------
       for (i = 0; i <len - 1; i++)
        {
            for (j = 0; j < len - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
 //printing first half of the array

        for( i=0;i < len/2;i++)
        {
            System.out.println(arr[i]);
        }
//printing second half of the array
       
        for( i=len-1;i >= len/2;i--)
        {
            System.out.println(arr[i]);
        }

    }
    
}