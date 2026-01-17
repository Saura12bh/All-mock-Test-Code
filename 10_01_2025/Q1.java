//WAP to find number is +ve ,-ve or Zero using ternary oprator

import java.util.*;
public class Q1{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");  //user input
int n=sc.nextInt();
String res= (n>0)?"number is positive":(n<0)?"number is negative":"number is Zero";  //(n>0)=>exp1 True =>positive else n<0 true =>-ve else zero
System.out.println(res);// display result
}
}
