/*Q7. Write a Java program to find the longest word in a given sentence.
Example:
Input → "Java is a powerful language"
Output → "powerful"
*/
import java.util.*;
public class Q7 {
    public static void main(String x[]) {
        
	Scanner sc=new Scanner(System.in);
	//input form user
	System.out.println("Enter a String");
	String s=sc.nextLine();
	
	//orignal String
	System.out.println("Orignal String => "+s);

	
	i=0 0  sai 3  sai  
	j=" "
	//make words array from sentence using split method
        String words[] = s.split(" ");

	//create new String to store the longestword   //om sai a  input string->   
        String longw="";

	//traverse each word form words array
        for (String word: words) {   //om  sai a  
            if (word.length() > longw.length())  //jr current word chi length hi longestword peksha mothi asel tr lw=word kela
	   {               
                longw=word; 
            }
        }


	//for(int i=0;i<words.length;i++)
	//printing longest word and size of it
        System.out.println("Longest word form Strig =>"+longw);
        System.out.println("longest word length =>"+longw.length());
    }
}
