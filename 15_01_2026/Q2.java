/*2)	Find All Pairs with Given Sum
You are given an integer array arr of size N and an integer S representing a target sum.
Your task is to find all unique pairs of elements in the array whose sum is equal to S.
Each pair should be printed in the order in which the elements appear in the array.
If no such pairs exist, print “No pairs found”.

Input :  arr = [1, 5, 7, -1, 5]
S = 6
Output: (1, 5), (7, -1), (1, 5)
*/
import java.util.*;
public class Q2 {
	public static void main(String[] x[]) {
		Scanner sc=new Scanner(System.in);
		//user enter sixe and value in array
		System.out.println("Enter Size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" element in Array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//take target sum                              
		System.out.println("Enter Target Sum");
		int sum=sc.nextInt();
	
		//traverse array element and compare with  sum
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(a[i]+"\t"+a[j]);
				}
			}
		}

	}
}
