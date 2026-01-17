//Q5 Write a Java program to count the number of alphabets, vowels, consonants, digits, 
//and special symbols in a character array
import java.util.*;
public class Q5{
    public static void main(String x[]) {
	Scanner sc=new Scanner(System.in); 

	//array size
	System.out.println("Enter size of character array:");
        int n = sc.nextInt();
	//initilize array

        char a[] = new char[n];
	//accept input form user 

        System.out.println("Enter " + n + " elements in the array:");
        for (int i = 0; i < a.length; i++)
	 {
            a[i] = sc.next().charAt(0);
        }
        //display array

	 System.out.println(" elements in the array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        } 
        System.out.println(); 

	//define all count varivle 0 and check conditions
       int alpha=0,vow=0,con=0,dig=0,sp=0;

        for (int i = 0; i < a.length; i++) {
           if(a[i]>='A' && a[i]<='Z' ||a[i]>='a' && a[i]<='z')
		{	
		  alpha++;
		   if (a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
		   {
                    vow++;
                  } else {
                    con++;
		         }
		}
           else if(a[i]>'0' && a[i]<'9')
		{
		  dig++;
		}
              else
		{
		sp++;
		}
        }
     	//display total count of each charater
        System.out.println("Total Alphabets =>"+alpha);
        System.out.println("Total Vowels =>"+vow);
        System.out.println("Total Consonants=>"+con);
        System.out.println("Total Digits=>"+dig);
        System.out.println("Total Special Symbols=>"+sp);
    }
}