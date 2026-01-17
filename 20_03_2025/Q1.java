//  12 3 4 5  -1 -3 -2
import java.util.*;
 public class Q1{
public static void main(String x[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array");
   int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("enter "+n+" element in array");
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("before the opration on Array");
  for(int i=0;i<n;i++)
  {
   System.out.print(" "+a[i]);
  }
  System.out.println();
  int temp;
  for(int i=0;i<n-1;i++)
  {
    for(int j=i;j<n;j++)
   {
      if(a[i]>a[j])
	{
          temp=a[i];
 	   a[i]=a[j];
           a[j]=temp;
	}
   }
  }
  System.out.println("After the opration on Array");
  for(int i=0;i<n;i++)
  {
   System.out.print(" "+a[i]);
  }
}
}