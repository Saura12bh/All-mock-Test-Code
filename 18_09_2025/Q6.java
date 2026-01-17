/*
Q6. Create a Java program to process a range of numbers using multithreading.
Requirements:
1. Accept a number N from the user.
2. Create two threads:
EvenThread: Prints all even numbers from 1 to N and calculates their sum.
OddThread: Prints all odd numbers from 1 to N and calculates their product.
3. Use Thread.join() to ensure both threads complete before the main thread prints results.
4. Display the sum of even numbers and product of odd numbers at the end.
Logic Operations Involved:
• Thread creation and execution order
• Mathematical sum and product calculations
• Thread coordination

*/

import java.util.*;
//even thread
class EvenThread extends Thread {
    int n;
    int evenSum = 0;

    EvenThread(int n) {
        this.n = n;
    }

    public void run() {
        try {
            System.out.print("Even Numbers: ");
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    evenSum = evenSum + i;
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//odd thread
class OddThread extends Thread {
    int n;
    long oddProduct = 1; // product can be very large

    OddThread(int n) {
        this.n = n;
    }

    public void run() {
        try {
            System.out.print("Odd Numbers: ");
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    oddProduct=oddProduct*i;
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Q6 {
    public static void main(String x[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to perform opertion: ");
        int n = sc.nextInt();

        EvenThread evenThread = new EvenThread(n);
        OddThread oddThread = new OddThread(n);

	//call the thread
        evenThread.start();
        oddThread.start();

        // Wait for both threads to finish
        evenThread.join();
        oddThread.join();

        // Print final results
        System.out.println("\nSum of Even Numbers: " + evenThread.evenSum);
        System.out.println("Product of Odd Numbers: " + oddThread.oddProduct);
    }
}
