//WAP of Menu driven using switch case and DoWhile loop 1=>Area of Rectangle 2=>Area of Triangle 3=>Area of Equilateral triangle

import java.util.*;
public class Q5{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int y;                             //this varible for take input form user to continue or not the menu
do{
    System.out.println("*** Menu***");
    System.out.println("1=>Area of Rectangle\n 2=>Area of Triangle \n3=>Area of Equilateral triangle");  //menu for user to select particular opration
    System.out.println("Enter your choice");
    int ch=sc.nextInt();           //taking choice form user
    switch(ch)                    //pass choice to switch
        {
	case 1:       //case area Reactangle
	System.out.println("Enter a lenth");
	double len=sc.nextDouble();
	System.out.println("Enter a Width");
	double wid=sc.nextDouble();
	System.out.println("Area of Reactangle="+(len*wid));
	break;

	case 2:			//case area Triangle
	System.out.println("Enter a base");
	double base=sc.nextDouble();
	System.out.println("Enter a Height");
	double hig=sc.nextDouble();
	System.out.println("Area of Triangle="+((base*hig)/2));
	break;

	case 3:			//case area eqilateral
	System.out.println("Enter a Side");
	double side=sc.nextDouble();
	double val=Math.sqrt(3)/4;
	double area=val*side*side;
	System.out.println("Area of Equilateral triangle="+area);	
	break;
	default:              //if user do not pass valid choice
	System.out.println("Please enter valid choice");
        }
	     System.out.println("you want to continue(yes=1)(no=0)");  //to ask your wants to contine or not
	     y=sc.nextInt();
   }while(y==1);
 }
}
