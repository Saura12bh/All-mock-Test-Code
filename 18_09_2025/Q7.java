/*
Q7. Create a menu-driven program where the user can select an option to simulate different exceptions
and handle them using try-catch blocks.
1. ArithmeticException:
2. NullPointerException:
3. NumberFormatException:
4. ArrayIndexOutOfBoundsException:
5. ClassNotFoundException:
*/
import java.util.*;

public class Q7 {
    public static void main(String  x[]) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
	   //Display menu to user
            System.out.println("\n***** Menu ****");
            System.out.println("1. ArithmeticException");
            System.out.println("2. NullPointerException");
            System.out.println("3. NumberFormatException");
            System.out.println("4. ArrayIndexOutOfBoundsException");
            System.out.println("5. ClassNotFoundException");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            ch= sc.nextInt();

	    //switch case
            switch (ch) {
                case 1: // ArithmeticException
                    try {
			System.out.println("Enter a value");
			int a=sc.nextInt();
			System.out.println("Enter B value");
			int b=sc.nextInt();
			System.out.println("value a= "+a+ " value b= "+b);
                        int c = a / b; // division by zero
                        System.out.println("Result: " + c);
                    } catch (ArithmeticException e) {
                        System.out.println("Caught ArithmeticException: " + e);
                    }
                    break;

                case 2: // NullPointerException
                    try {
                        String s= null;
                        System.out.println(s.length());
                    } catch (NullPointerException e) {
                        System.out.println("Caught NullPointerException: " + e);
                    }
                    break;

                case 3: // NumberFormatException
                    try {
                        String s = "Sai";
                        int num = Integer.parseInt(s);
                        System.out.println("Number: " + num);
                    } catch (NumberFormatException e) {
                        System.out.println("Caught NumberFormatException: " + e);
                    }
                    break;

                case 4: // ArrayIndexOutOfBoundsException
                    try {
                        int a[] = {1,1,2};
                        System.out.println(a[10]); // invalid index
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
                    }
                    break;

                case 6:
			System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (ch!= 6);

    }
}
