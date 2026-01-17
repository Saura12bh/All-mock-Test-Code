/*
Q5.Find the Frequency of an Element in Array
Description: Find how many times an element appears in an array.
Input: [1, 2, 2, 3, 4, 2, 5], element 2
Output: 3  */
import java.util.*;
public class Q5 {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");  //size of array
        int n = sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter "+n+" element in array");  //enter n number of element in array
	for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
	}
	System.out.println("Enter element to find frequency in array");  //get input form user of element
	int ele=sc.nextInt();
	int cnt=0;                   //cnt=0 for counting frequency of element
	  for (int i = 0; i <n; i++) 
	{  
             if(a[i]==ele)   //if element is present then cnt value increse by one
		{
		cnt++;
		}
        }
         System.out.print("Element appears in array ="+cnt);
    }
}
