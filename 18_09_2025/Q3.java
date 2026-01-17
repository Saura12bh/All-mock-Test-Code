/*
Q3. We are asked to find the smallest element to the right of every element in the array.
• If a smaller element exists on the right, store that.
• If no element is smaller, store -1.
*/

import java.util.*;
public class Q3 {
    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	//array size form user
	System.out.println("Enter size of array");
        int n=sc.nextInt();
	//array
	int arr[]=new int[n];
	System.out.println("Enter element in array");
	for(int i=0;i<n;i++)
	{
	  arr[i]=sc.nextInt();
	}

        int res[]= new int[n];
        for (int i = 0; i < n; i++) {
            int min = -1;  // Default value if no smaller element found

            for (int j = i + 1; j < n; j++) {
		 if(arr[i]<arr[j]){
                if (min ==-1 || arr[j] < min) {   
                    min=arr[j]; // store smallest found so far
                }
		}
            }
            res[i]=min; 
        }

	//display output array
	System.out.println("Output");
	for(int i=0;i<n;i++)
	{
	System.out.print(res[i]);
	}
    }
}
