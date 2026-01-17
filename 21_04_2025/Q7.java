/*
Q7. Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.
Input: [1, 2, 3, 4], [3, 4, 5, 6]
Output: [3, 4]
*/
//Find the common elements in two arrays.
public class Q7 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,2};   //aplya la sorted array provide krayla lagta
        int[] arr2 = {2,4,1,2};

        System.out.print("Common Elements: ");

        // finding and printing comman element
        for (int i = 0; i < arr1.length; i++) {  //1st array
            for (int j = 0; j < arr2.length; j++) {  //2nd array
                if (arr1[i] == arr2[j]) {   
                    System.out.print(arr1[i] + " ");
                    break; // Avoids duplicate prints for repeated elements in arr2
                }
            }
        }
    }
}
