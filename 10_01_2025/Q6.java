//WAP check wether number is perfect or not  6= 1, 2 , 3 ==1+2+3=6  
import java.util.*;
public class Q6{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");  	//input a number
int n=sc.nextInt(); 
	int rem=0,sum=0,i=1;  // initilization of variable
	while(i<n){           // condtions for i value less n then i++
	rem=n%i;              //to find rem of n%i if rem==0 then sum=sum+i it means after i%n=0
	if(rem==0)
	sum=sum+i;
	i++;
	}
if(n==sum)  //after count total sum check sum is euqal to the number if true print perfect else not perfect
System.out.println("number is perfect");
else
System.out.println("number is not perfect");
}
}
