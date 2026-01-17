/*
 Q3. Write a java program to find the largest missing number from an integer array.  
Input Array : arr = {3, 7, 1, 9, 4}  
Range: From 1 to 9 
All numbers in range: 1 2 3 4 5 6 7 8 9  
Present in array: 1 3 4 7 9 
Missing numbers: 2, 5, 6, 8  
Output : 8 (This is the largest missing number) */

import java.util.Scanner;
public class Q3{
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size  of array: ");
        int size = sc.nextInt();
	//array
        int[] a = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Find max from array to decide highest range
        int max = a[0];
        for (int i = 1; i < size; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        int largestMiss =-1;
        for (int num = 1; num <= max; num++) {
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (a[i] == num)  //9 ==9 
               {
                    found = true; //true
                    break;
                }
            }
            if (!found) {
                largestMiss = num;
            }
        }

        if (largestMiss == -1) {
            System.out.println("No missing number");
        } else {
            System.out.println("Largest missing number: " + largestMiss);
        }

       
    }
}