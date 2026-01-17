/*1)	First Non-Repeating Element Using HashMap. 
Time Complexity: O(n)
            Space Complexity: O(n) (for HashMap)
	Avoid nested loops (O(n²))

Input - 9 4 9 3 7 4
Output-  3
*/
import java.util.*;
public class Q1{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size of array");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter "+n+" element in array");
	for(int i=0;i<n;i++)
	{
	  a[i]=sc.nextInt();
	}

	System.out.println("All Values");
	for(int i:a)
	{
	  System.out.print("\t"+i);
	}
	System.out.println();

	//to store value,frequecy
	HashMap<Integer ,Integer> freq=new HashMap<>();  //  1  2 3 1 2
	
	//count the frequency of element
	for(Integer val:a)   //1
	{
		Integer cnt=freq.get(val);  
		if(cnt==null)
		{
	        cnt=0;
		}  
		cnt=cnt+1;  //cnt=1  1 1=1+1 =
		freq.put(val,cnt); 
	}
	
	Set<Map.Entry<Integer,Integer>> ent=freq.entrySet();
	System.out.println("First Non reapting value");

	//if element not found
	boolean b=true;
	for(Map.Entry<Integer, Integer> obj:ent)    //map  key value   number   freq ->1
	{
		//if frequecy is then print is value and break the loop
		if(obj.getValue()==1) //freuecy jyachi one to check
		{
		System.out.println(obj.getKey());
		b=false;
		break;
		}
	}
	
	if(b==true)   //if not found any non repadting element
	{
	System.out.println("Their is no non repating element");
	}
}
}
