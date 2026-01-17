/*
Q5. Write a java program to remove duplicates value from array.
Input : 1 2 3 2 4 5 4 4 6 7
Output : 1 2 3 4 5 6 7  */
import java.util.*;
public class Q5{
    public static void main(String[] x) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the arrays:");
        int n = sc.nextInt();

	//create array 
        int a[]=new int[n];
	
	//input form user
	System.out.println("Enter "+n+" element in array");
	for(int i=0;i<n;i++)
	{
	  a[i]=sc.nextInt();
	}
	
	//create linkedHashMap 
	LinkedHashSet<Integer> h=new LinkedHashSet<>();
	
	//interate each element of Array and add in linkedHashSet
	for(int i:a)
	{
	 h.add(i); 
	}

	//printling linkedHashSet
	System.out.println("After Removing Duplicate number");
	for(Integer obj:h)
	{
	System.out.println(obj);
	}
}
}