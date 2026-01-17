/*
Q4. Write a java program to check string palindrome string or not.

*/
import java.util.*;
public class Q4{
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
	//input form user 
        System.out.print("Enter a string=> ");
        String str1=sc.nextLine();
	//convert to lower case
	String str=str1.toLowerCase();
        // Reverse the string
        String rev="";
        for(int i=str.length()-1;i>=0;i--) {  
            rev=rev+str.charAt(i);  
        }

        // Check if equal
        if(str.equals(rev))
	{  
            System.out.println("Palindrome String");
        }else 
	{
            System.out.println("Not a Palindrome String");
        }
    }
}

