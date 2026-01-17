/*Q6. Find the Second Largest Element in Array
Description: Find the second largest element in an array.
Input: [10, 20, 30, 40, 50
Output: 40
*/
import java.util.*;
public class Q6{
    public static void main(String[] x) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");  //size of array
        int n = sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter "+n+" element in array");  //enter n number of element in array
	for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
	}
        int largest = arr[0]; 
        int secondLargest = arr[0]; // Default value

        // First loop: Find the largest number
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Second loop: Find the second largest number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {  //10>10 &&10<25
                secondLargest = arr[i];
            }
        }
	   
            System.out.println("Second largest element: " + secondLargest);
      
    }
}


