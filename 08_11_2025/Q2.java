/* 
Q2. Write a program in Java to count the number of inversions in a given array
Expected Output :
The given array is : 1 9 6 4 5
The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
The number of inversions can be formed from the array is: 5
*/

import java.util.*;

public class Q2 {
    public static void main(String  x[]) {
        Scanner sc = new Scanner(System.in);

        // Get array input
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter " + n + " elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Display the given array
        System.out.print("The given array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int count = 0;

        System.out.print("The inversions are: ");
        // Check for inversions using nested loops
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    System.out.print("(" + a[i] + ", " + a[j] + ") ");
                    count++;
                }
            }
        }

        System.out.println();
        System.out.println("The number of inversions can be formed from the array is: " + count);
    }
}
