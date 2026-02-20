/*
Q1. Given an integer array nums and an integer k, return the k
th largest element in the array.
Note that it is the k
th largest element in the sorted order, not the k
th distinct element.
Can you solve it without sorting?
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
*/

import java.util.*;
public class RSQ1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] a= new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k ");
        int k= scanner.nextInt();

        int kthLar=0;
        for (int j = 1; j <= k; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
              kthLar=max;
        }
        System.out.println( n+ "th Largest Element = " + kthLar);
}
}