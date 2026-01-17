//Q4. S = x/2 + x/5 + x/8 + x/11 + x/14+x/17+ x/20
import java.util.*;
public class Q4 {
    public static void main(String[] xx) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");  //user input of x
        int x = sc.nextInt();
        int sum = 0;
	int n=2;
	  for (int i = 1; i <= 7; i++) 
	{
            sum =sum+(x/n);    
	    n=n+3;
        }
         System.out.print("sum of series ="+sum);
    }
}
