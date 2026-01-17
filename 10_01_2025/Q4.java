//find the maximum number form three number

import java.util.*;
public class Q4{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter First number");  //input 1st no
int n1=sc.nextInt();
System.out.println("enter Second number"); //input 2nd no
int n2=sc.nextInt();
System.out.println("enter third number"); ////input 3rd no
int n3=sc.nextInt();
if(n1>n2 && n1>n3)            		//check condtion 3>1&& 3>2 =>3 is max
{
System.out.println(n1+"is maximum");
}
else if(n2>n1 && n2>n3)			//check condtion 4>1&& 4>2 =>4 is max
{
System.out.println(n2+"is maximum");
}
else{  					//if both conditions false then except n1,n2 then n3 is max
System.out.println(n3+"is maximum");
}
}
}

