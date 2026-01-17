/* Q1. Write a java program to print 1 to nth happy number */
/* Write a program to display all happy number from 1 to n
 Happy Number is a number that, when you replace it with the sum of the squares of its digits and repeat the process, eventually becomes 1.
 num==1 and cycle may not be repated
10-> 10
Enter n: 20
Happy numbers from 1 to 20:
1 7 10 13 19

10 -> 1  0  1->1    0-> 0
0+1=1=>happly  number
*/
import java.util.*;

public class Q1{
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth  number to print happy number => ");
        int n = sc.nextInt();
        System.out.println("Happy numbers from 1 to "+n+" =>");

        for (int i=1;i<=n;i++){
            int num=i;
            // Loop to check if number is happy
            while (num!=1 && num!=4) { // If it becomes 4 → cycle starts → not happy
                int sum = 0;  //10
                while (num > 0) {
                    int digit = num % 10;
                    sum=sum+digit*digit;
                    num=num/10;
                }
                num=sum;
            }

            if(num==1) { // Happy number
                System.out.print(i+ " ");
            }
        }
    }
}
