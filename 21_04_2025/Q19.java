/*
Q19. Move Zeros to End of Array
•	Description: Move all zero elements of an array to the end while maintaining the order of other elements.
•	Input: [0, 1, 2, 0, 3, 4]
•	Output: [1, 2, 3, 4, 0, 0]
*/
public class Q19 {
    public static void main(String[] x) {

        int[] arr = {0,1,2,0,3,4}; // Example array
        int n = arr.length;
        int index = 0; // Pointer for non-zero elements

        // Traverse the array and move non-zero elements to the  front  
        for (int i = 0; i < n; i++) {       //jr array madhla element zero sodun dusra asel tr to arr madhe start la storehoyl
            if (arr[i] != 0) {
                arr[index] = arr[i]; // Move non-zero element
                index++; // Move the index forward
            }
        }

        // Fill remaining positions with zero
        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }

        // Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
