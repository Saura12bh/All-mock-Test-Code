/*Q7. WAP to Create a class name as StudentPer with a three function void setValue( ) , void 
CalPer( ) and void checkGrades( ).
void setValue(int studid, String name, int marks[ ])
{
// this function can accept the array.
}
void CalPer( ) 
{
//this function can use calculate the percentage in array.
}
void checkGrades()
{
//this function can use check the grade.
percentage >= 91% to 100 % : Grade A
81% to 90% : Grade B
71% to 80% : Grade C
61% to 70% : Grade D
51% to 60% : Grade E
41% to 50% : Grade F
10% to 40% : Student is Fail.
}
*/

import java.util.*;
class StudentPer{
//instace variable
int id;
String name;
int m[];
double per; 
 //set value
void setValue(int i,String n,int m1[])
{
  id=i;
  name=n;
  m=m1;
}
//calculate percentage 
void calPer()
{ int total=0; 
  for(int i=0;i<m.length;i++)
 { 
   total=total+m[i];
 }
 per = ((double) total / 500) * 100;
}
//printing grade as per percentage
void checkGrades() {
       if (per>= 91 && per<= 100) 
	{
        System.out.println("Grade: A");
    	} 
	else if (per>=81 && per<= 90)
	 {
        System.out.println("Grade: B");
    	} 
	else if (per>= 71 && per<= 80)
	 {
        System.out.println("Grade: C");
	 } 
	else if (per>=61 && per<=70) 
	{
        System.out.println("Grade: D");
	 }
	 else if (per>= 51 && per<= 60) 
	{
        System.out.println("Grade: E");
    	} 
	else if (per>= 41 && per<= 50)
	 {
        System.out.println("Grade: F");
    	} 
	else if (per>= 10 && per<= 40) 
	{
        System.out.println("Student is Fail.");
    	}
	 else
	 {
        System.out.println("Invalid percentage input.");
    	}
   }
}
public class Q7
{
public static void main(String x[])
{      
        //accept details from user
	Scanner sc=new Scanner(System.in);
	//student 1 
	System.out.println("student 1");
	//creating object of student2 and call method
	StudentPer s1=new StudentPer();	
	System.out.println("enter id");
        int id=sc.nextInt();
	System.out.println("enter name");
	String n1=sc.next();
	System.out.println("enter 5 subject mark");
	int a1[]=new int[5];
	for(int i=0;i<5;i++)
	{
	a1[i]=sc.nextInt();
	}
 	s1.setValue(id,n1,a1);
	s1.calPer();
	s1.checkGrades();


	//student 2
	System.out.println("student 2");
	//creating object of student1  and call method
	StudentPer s2=new StudentPer();	
        System.out.println("enter id");
        int id2=sc.nextInt();
	System.out.println("enter name");
	String n2=sc.next();
	System.out.println("enter 5 subject mark");
	int a2[]=new int[5];
	for(int i=0;i<5;i++)
	{
	a2[i]=sc.nextInt();
	}
 	s2.setValue(id2,n2,a2);
	s2.calPer();
	s2.checkGrades();
}
}








