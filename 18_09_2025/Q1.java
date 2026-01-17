/*Q1. Write a java program to check whether number is happy number or not happy number using
function.*/
import java.util.*;

// Class that contains logic
class HappyNumber{
    int num; // instance variable

    // Constructor to initialize number
    HappyNumber(int num) {
        this.num= num;
    }

    // Function to find sum of squares of digits
    int sum(int n) {    
        int sum = 0; 
        while (n> 0) {  
            int digit = n% 10; 
            sum =sum+digit * digit; 
            n=n/10;
        }
        return sum;  
    }

    // Function to check if number is happy  
    boolean isHpy() {
        int n1= num;
        while (n1!=1&&n1!=4) { 
            n1=sum(n1); 
        }
        return n1==1;   //if n1==1 then it return true otherwice return false
    }

    // Function to display result
    void displayResult() {
	boolean b=isHpy();
        if (b==true){
            System.out.println(num+ " is a Happy Number.");
	  }
        else
	   {
            System.out.println(num+ " is Not a Happy Number.");
	  }
    }
}

// Main class
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create object 
        HappyNumber obj = new HappyNumber(n);

        // Display result using function
        obj.displayResult();
    }
}
