//reverse the num=123 without using loop

public class Q3{
public static void main(String x[])
{
int n=123;       //given number
int rem=0,rev=0;  //initilization
System.out.println("before reverse="+n);

rem=n%10;         //3=123%10
n=n/10;		  //12=123/10;
rev=rev+rem*100;  //300=0+3*100

rem=n%10; 	//2=12%10
n=n/10;		//1=12/10;
rev=rev+rem*10;	 //320=300+2*10

rem=n%10;	//1=1%10
n=n/10;		//0=1/10;
rev=rev+rem*1;	//321=320+1*1

System.out.println("after reverse="+rev); //display reverse number
}
}
