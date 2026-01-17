/*Q1. Write a Java program to find the smallest positive integer that is missing from the array.
Input:
arr = {0, -10, 1, 3, -20}
Output:
Smallest Missing Positive Number = 2  */

import java.util.*;
public class Q1{
    public static void main(String x[])     
	{
        Scanner sc=new Scanner(System.in);
	
	//getting size and element form user
	System.out.println("Enter Size of array");
	int n=sc.nextInt();
	int a[]=new int[n];
        System.out.println("Enter "+n+" element in Array");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}

	//num for checking no present or not 
	//cnt for condtion checking up to array length
	int num=1,cnt=0;
	boolean b=true;      //if their is no postive element   //6-  1 2 4
	while(cnt<=n) { 
	    //if num is not present then it will be false
            boolean found = false;

            // Check if 'num' is present in the array
            for(int i=0;i<n;i++) {
                if (a[i]==num) {       
                    found=true;
                    break;
                }
            }

            // If not found, this is the missing positive number
            if(found==false) 
	     {
               System.out.println("Smallest Missing Positive Number = " + num);
		b=false;
                break;
             }

            num++; // Check next number  2
	    cnt++;  //incres cnt value
        }

	//if not +ve number is present then 	
	if(b==true)
	{
	  System.out.println("Theire is no positive missing number in array");
	}
    }
}
