/*Q3. Write a Java program to repeatedly multiply all non-zero digits of a number until it becomes a single
digit.
Sample Input :
Input: 679 Output: 6 
Explanation: This question involves a while loop inside another loop, extracting digits using
modulus/division, skipping zeros, and calculating product until a single-digit number is reached. It checks
your grasp on loop control and digit-level processing  */

import java.util.*;
public class Q3 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int n=sc.nextInt();                //input from user  11
        System.out.print("Number ="+n);
        while (n>=10) {      //11>10       n=1 false  pri 
            int p=1;
            int temp = n;    //temp=>11
            while (temp > 0) {          
                int digit = temp % 10;  //digit=1
                if (digit != 0) {    //yes
                    p=p*digit;        //1=1*1
                }
                temp=temp/10;       //1=11/10
            }
	  n=p;                      //n=1
        }
        System.out.println("  Product ="+n);
}
}