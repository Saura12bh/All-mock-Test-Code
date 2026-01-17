//WAP to check leap year or not.Input takes form user

import java.util.*;
public class Q2{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a Year");  //input year
	int yr=sc.nextInt();
	if((yr%4==0 && yr%100!=0)||(yr%400==0))  //2024%4==0 &&2024%400==0  =>leap year  2004%4 is not euqal to zero then 2005 is not leap year
	{
		System.out.println("Year is leap year");  //display message
	}
	else
	{	
		System.out.println("Year is not  leap year");
	}
   }
}
