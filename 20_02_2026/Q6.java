/*
Q6. Store multiple words in an ArrayList. Find the longest word without using compareTo().
Input:
[cat, elephant, dog, tiger]
Output:
elephant
Description:
Compare word lengths manually. */

import java.util.*;

public class Q6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list= new ArrayList<>();

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); 
	//store word in list
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            String s=sc.nextLine();
            list.add(s);
        }

	//store max word as first word in max variable
        String Max = list.get(0);

        for (int i = 1; i < list.size(); i++) 
            {
	      //fetch each word from the list
            String word = list.get(i);
	     //compare each word with max word
            if (word.length() > Max.length()) {
                Max = word;
            }
        }
	//print longest word 
        System.out.println("longest word: " + Max); 
        System.out.println("longest word length: " + Max.length());  
    }
}