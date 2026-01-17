/*Q9. Check if Array is Palindrome
Description: Check if an array is the same when reversed.
Input: [1, 2, 3, 2, 1]
Output: Palindrome
*/
public class Q9 {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;
        int start = 0;
        int end = arr.length - 1;  //end=4
        while (start < end) { 
            if (arr[start] != arr[end]) {  //1!=1 false ,2!=2 false 
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome==true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

