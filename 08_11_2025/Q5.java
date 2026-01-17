/* 
Q5. Write a Java program to remove duplicate integers from an ArrayList<Integer> 
without using any inbuilt methods like contains(), indexOf(), or distinct().

Example:
Input:  [2, 3, 4, 2, 3, 5, 6, 4]
Output: [2, 3, 4, 5, 6]
*/

import java.util.*;

public class Q5 {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        // Input ArrayList from user
        ArrayList<Integer> a = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println("Original Array List: " + a);

        // Create new list for unique element
        ArrayList<Integer> a2 = new ArrayList<>();

        // Traverse each element
        for (int i = 0; i < a.size(); i++) {   
            int ele = a.get(i);   
            boolean found = false;

            // Check manually if current element already exists in   a2
            for (int j = 0; j < a2.size(); j++) {    
                if (a2.get(j) == ele) {   
                    found = true;
                    break;
                }
            }

            // If not found  add to uniqueList
            if (found==false) {
                a2.add(ele);   //1
            }
        }

        System.out.println("Array List after removing duplicates: " + a2);
    }
}
