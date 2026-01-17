//Q2. Write a java program to print 1 to nth strong number
/* step 1=> Looping Through Numbers
 step 2=>Extracting Digits (Using While Loop)
int num = i;
int sum = 0;
int temp = num;
step 3=>Calculating Factorial (Using Nested For Loop)
step 4=> Summing Factorials
sum =sum+ fact; // Add factorial to sum
temp =temp/10;  // Remove last digit
step 5=>Checking if the Number is Strong
if (sum == i) {
    System.out.println(i);
}
*/
import java.util.*;
public class Q2{
    public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
        System.out.println("enter n th number to find Strong number");
        int num=sc.nextInt();
        System.out.println("Strong numbers from 1 to"+num);

        // Step 1: Loop through numbers from 1 to n
        for (int i = 1; i <=num; i++) {
            int n = i;
            int sum = 0;
            int temp = n;

            // Step 2: Extracting digits using while loop
            while (temp != 0) {
                int digit = temp % 10;  // Get last digit
                
                // Step 3: Calculating factorial using nested for loop
                int fact = 1;
                for (int j = 1; j <= digit; j++) {
                    fact =fact*j;
                }

                // Step 4: Summing factorials
                sum=sum+fact;
                temp=temp/10;  // Remove last digit
            }

            // Step 5: Checking if the number is Strong
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
