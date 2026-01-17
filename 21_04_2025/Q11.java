/*
Q11. . Find Missing Number in Array
Description: Find the missing number in an array containing numbers from 1 to n.
Input: [1, 2, 4, 5]
Output: 3
*/
import java.util.*;
public class Q11{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int i,temp=0;
	System.out.println("enter 5 elements");
	for(i=0;i<a.length;i++)
	{
	a[i]=sc.nextInt();
	}  
	//sorting in acending order
	for(i=0;i<a.length;i++)
	{
	   for(int j=i+1;j<a.length;j++)
	  {
	  if(a[i]>a[j]){
	  temp=a[i];
	  a[i]=a[j];
	   a[j]=temp;
	   }
	   }
	}
	System.out.println("\n Missing Element ");
	for (i = 0; i < a.length - 1; i++) {
               for (int j = a[i] + 1; j < a[i + 1]; j++) // 1=>1 
		{
                    System.out.print(j + " ");
                }
       }

}
}


