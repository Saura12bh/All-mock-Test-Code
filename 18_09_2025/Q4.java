/*Q4. Problem: An element is a peak if it is not smaller than its neighbors. Print any peak element.
• Input: {10, 20, 15, 2, 23, 90, 67}   
• Output: 20 or 90 (both are peaks).
Concept: Traverse or use binary search for efficient solution. */
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	//input from user
	System.out.println("Enter size of array");
        int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter element in array");
	for(int i=0;i<n;i++)
	{
	  arr[i]=sc.nextInt();
	}
 
	boolean found=true;
        for (int i = 0; i < n; i++) {  
            if ((i == 0 || arr[i] >arr[i - 1]) && (i == n - 1|| arr[i] > arr[i + 1])) {   
                System.out.println("Peak Element: " + arr[i]); 
  		b=false;
		break;
            }
        }
	//if thire is no peek element
	if(b==true)
	{
	 System.out.println("no peak element ");
	}
    }
}
