/*
Q2. Count the number of prime numbers in an array.
• Input: arr = [2, 5, 6, 9, 11]
• Output: Count of prime numbers = 3
• Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such
elements.*/

import java.util.*;
public class Q2{
    public static void main(String x[]) {  
        
	Scanner sc=new Scanner(System.in);

	//array input form user and thire size
	System.out.println("Enter size of array");
	int n=sc.nextInt();
	System.out.println("Enter "+ n +" element in array");
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	  arr[i]=sc.nextInt();
	}

	//to count how many number are prime
        int cnt=0;
        for (int i=0;i<n;i++) {
            int num=arr[i];   
		
	    //jr array madhla number prime asel tr to last parunt true rahil 
            boolean prime=true; 
            if (num<2) {     
                prime=false; // 0 and 1 are not prime
            }
	    else 
	     {
		//checking array element is prime or not
                for (int j=2;j<=num/2;j++) 
		{
                    if (num%j==0) {     
                        prime=false;    
                        break;
                    }
                }
            }
	     //if element is prime menas ture then count value ++
            if (prime==true) {
                cnt++;
            }
        }

	//printlig how many number are prime from the array
        System.out.println("Count of prime numbers = "+cnt);
    }
}
