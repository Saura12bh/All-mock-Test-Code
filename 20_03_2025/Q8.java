/* Q8. WAP to Create a class name as Isogram with a two function void setArray(char ch[]) 
and void checkIsogram( ).
setArray(char ch[]) 
{
// this function can accept the array.
}
void checkIsogram( ).
{
//this function can use the implement the logic.
//Given a word or phrase, check if it is an isogram or not. An Isogram is a word in which 
//no letter occurs more than once.
//Input: Machine Output: True
//Explanation: “Machine” does not have any character repeating, it is an Isogram
//Input : Geek Output : False
//Explanation: “Geek” has ‘e’ as repeating character, it is not an Isogram
*/

import java.util.*;
class Isogram {
    char[] ch; // Character array to store input word

    // Function to set array
    void setArray(char ch1[]) {
        ch=ch1; // Assign input array to instance variable
    }

    // Function to check if the word is an Isogram
    void checkIsogram() {
        boolean isIsogram = true;   //firstly declare as true beaz after we can check in if condtion it is false or not

        // Check for repeating characters
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    isIsogram = false; // If duplicate found, set flag to false
                    break;
                }
            }
            if (!isIsogram) 
		break;
        }

        // Print result
        if (isIsogram) {
            System.out.println("True (The word is an Isogram)");
        } else {
            System.out.println("False (The word is NOT an Isogram)");
        }
    }
}
public class Q8 {
    public static void main(String x[]) {
	Scanner sc=new Scanner(System.in);
         Isogram i=new Isogram();
	System.out.println("enter size word");
        int n=sc.nextInt();
        char c[]=new char[n];
	System.out.println("enter word");
        for(int k=0;k<n;k++)
	{
	  c[k] = sc.next().charAt(0);
	}
        i.setArray(c);
	i.checkIsogram();
    }
}
