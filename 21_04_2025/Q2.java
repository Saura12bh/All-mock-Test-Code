//Q2. Print the series:1, 11, 111, 1111,…………….?
import java.util.Scanner;

public class Q2 {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit of serires");  //user input for how many number can print of serires
        int n = sc.nextInt();
        int number = 0;
        for (int i = 1; i<= n; i++) {
            number = number * 10 + 1; // 1-> i=1 ,number=0 => 1=0*10+1  ,i=211=1*10+1
            System.out.print(number);  //print value in number
            System.out.print(", ");
        }
    }
}

