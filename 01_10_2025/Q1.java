/*Q1. Write a java program to display top three value from array.
Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
Expected Output: 92, 90, 86
*/

import java.util.*;
public class Q1{
    public static void main(String x[]) {
	Scanner sc=new Scanner(System.in);

	//input size and aray element form user
	System.out.println("Enter size of array");
	int n=sc.nextInt();
	System.out.println("Enter "+ n +" element in array");
	//declare array
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	  arr[i]=sc.nextInt();
	}

	//initilized value to variable  for finding
        int first =arr[0];    
        int second=arr[0];  
        int third=arr[0];  


	//finding first sec third largest element
        for (int i=0;i<n;i++)  
	 {
	     int num=arr[i];  
            if (num >first) {
                third=second; 
                second=first; 
                first=num;    

            } else if (num <first && num>second) {   
                third=second;
                second=num;
            } else if(num <second && num>third) { 
                third=num;
            }
        }

	//printing number
        System.out.println(first +", "+ second +", "+third);
    }
}

