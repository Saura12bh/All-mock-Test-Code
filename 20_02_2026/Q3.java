/*
Q3.Write a java program to find common elements between two arrays using Map.
Input :- Array1: {1, 2, 3, 4, 5}
 Array2: {3, 4, 5, 6, 7}
Output :- Common Elements: 3 4 5
Description:
Store first array elements in Map. Traverse second array and check manually if element exists.
*/
import java.util.*;
public class Q3{
public static void main(String args[])
{
  	Scanner sc=new Scanner(System.in);
	//input from user
	System.out.println("Enter Size of first array ");
	int n=sc.nextInt();
	//array first
	int first[]=new int[n];
	System.out.println("Enter "+n+" element in Array");
	for(int i=0;i<n;i++)
	{
          first[i]=sc.nextInt();
	}
	//second array 
	System.out.println("Enter Size of Second array ");
	int n1=sc.nextInt();
	//arrayList with integer
	int second[]=new int[n1];
	System.out.println("Enter "+n1+" element in Second array");
	for(int i=0;i<n1;i++)
	{
	  second[i]=sc.nextInt();
	}

	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	for(int ele:first)
	{
	  hm.put(ele,1);  
	}
	
	//travser second array element
	for(int ele:second)// 3 4 5 6 7
	{
	  Integer cnt=hm.get(ele);  //3 2  4 2   5  2  6 1 7 1
	  if(cnt==null)
	  {
	   cnt=0;
	  }
           cnt=cnt+1;
	  hm.put(ele,cnt);
	}

	System.out.println("common element");

	Set<Map.Entry<Integer,Integer>> ent=hm.entrySet();
	for(Map.Entry<Integer,Integer> obj:ent)
	{
	  if(obj.getValue()==2)  // 
	  {
	    System.out.println(obj.getKey());  //3 4 5
 	  }
	}
}
}