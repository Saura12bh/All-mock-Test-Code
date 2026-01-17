//Q3. Write a program in Java to find the sum of the given series
//S = a +  a^2 / 2 +  a^3 / 3 + ...... + a^10 / 10
import java.util.*;
public class Q3 {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A");  //user input of a
        int a = sc.nextInt();
        int sum = 0;
	int pow=a;
	  for (int i = 1; i <= 10; i++) {
            if (i > 1) {
                pow= pow * a; // to find the power 
            }
            sum =sum+(pow / i);    //adding value of each iteration
        }
         System.out.print("sum of series ="+sum);
    }
}
