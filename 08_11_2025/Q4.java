/* 
Q4. Write a Java program to Create two threads:
• One thread calculates the sum of even numbers from 1 to N.
• Another thread calculates the sum of odd numbers from 1 to N.
Handle exceptions if N is negative.
*/

import java.util.*;

// Thread 1 → calculates sum of even numbers
class EvenSumThread extends Thread {
    int n;

    EvenSumThread(int n) {
        this.n = n;
    }

    public void run() 
	{
        int sum = 0;
        for (int i=0; i<=n;i++) {
	   if(i%2==0)
	    {
            sum=sum+i;
	    }
        }
        System.out.println("Sum of even numbers from 1 to " + n + " = " + sum);
    }
}

// Thread 2 → calculates sum of odd numbers
class OddSumThread extends Thread {
    int n;

    OddSumThread(int n) {
        this.n = n;
    }

    public void run() {
        int oddsum = 0;
       for (int i=0; i<=n;i++) {
	   if(i%2!=0)
	    {
            oddsum=oddsum+i;
	    }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " = " + oddsum);
    }
}

// Main class
public class Q4 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value for geting even and odd Sum ");
            int n = sc.nextInt();

            // Handle negative input
            if (n < 0) {
                throw new Exception("N cannot be negative!"); 
            }
	   

            // Create threads
            EvenSumThread evenThread = new EvenSumThread(n);
            OddSumThread oddThread = new OddSumThread(n);

            // Start both threads
            evenThread.start();
            oddThread.start();

            // Wait for both to finish
            evenThread.join();
            oddThread.join();
        } 
	catch (Exception e)
	 {
            System.out.println(e);
        } 
   }
}
