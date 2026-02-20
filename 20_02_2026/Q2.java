/*
Q2. Store N integers in a List. Separate even and odd numbers into two different lists without
using built-in filtering.
Input:
6
4 7 10 13 2 9
Output:
Even List: 4 10 2
Odd List: 7 13 9
Description:
Use modulus logic and manually add elements into respective lists
*/
import java.util.*;
public class Q2{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	//input from user
	System.out.println("Enter Size of array list");
	int n=sc.nextInt();
	//arrayList with integer
	ArrayList<Integer> al=new ArrayList<>();
	System.out.println("Enter "+n+" element in List");
	for(int i=0;i<n;i++)
	{
	   int ele=sc.nextInt();
	  al.add(ele);
	}

	ArrayList<Integer> even=new ArrayList<>();
	ArrayList<Integer> odd=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
	   int ele=al.get(i);
	//check if element is odd or even	  
	   if(ele%2==0)
	  {
	     even.add(ele);
	  }
	   else
	 {
	    odd.add(ele);
	  }
	}
  	//even list
	System.out.println("Even List :"+even);
	//odd list
	System.out.println("odd list :"+odd);
}
}