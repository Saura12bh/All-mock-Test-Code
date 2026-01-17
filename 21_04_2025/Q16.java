/*
Q16. Array Pair Sum
•	Description: Write a program to find all pairs in an array whose sum equals a given target.
•	Input: [1, 4, 5, 3, 2], target 6
•	Output: [(4, 2), (5, 1)]
*/
import java.util.*;
public class Q16{
public static void main(String x[])
{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] a= new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
	System.out.println("enter sum to find pair");
	int sum=sc.nextInt();
	
	for(int i=0;i<n-1;i++)
	{
	 for(int j=i+1;j<n;j++)
	 {
		if(a[i]+a[j]==sum)
		{
		  System.out.println("sum  by value of Number "+a[i]+" and "+a[j]);
		  break;
		}
	 }
	}
}
}