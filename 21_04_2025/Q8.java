/*
Q8. Merge Two Arrays
Description: Merge two arrays into one.
Input: [1, 2, 3], [4, 5, 6]
Output: [1, 2, 3, 4, 5, 6]
*/
import java.util.*;
public class Q8{
public static  void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];  //first array
int b[]=new int[5];  //seconf array
int c[]=new int[10];   //storeing both array in
System.out.println("enter 5 element in A array");
for(int i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter 5 element in B array");
for(int i=0;i<5;i++)
{
b[i]=sc.nextInt();
}
// logic of merging two array
int size=5; //ha 5 ya sathi ghetla ki b che element 5 chya pudhe store zale pahije ya sathi
        for (int i = 0; i < 5; i++) {
            c[i] = a[i];         //ya line mule a che element a array madhle 5 element la store hotil
            c[i + size] = b[i];   // ya mul b che element 5  index pasun pudhe store hotil
        } 

//display array
System.out.println("after merge");
for(int i=0;i<10;i++)
{
System.out.println(c[i]);
}
}
}
