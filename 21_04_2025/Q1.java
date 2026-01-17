//Q1.WAP to print following pattern
/*
   1
  121
 12321
1234321
*/
public class Q1 {
    public static void main(String[] args) {
        int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {
            int num = 1;   //we need to start alwas form one their for num=1 

            for (int j = 1; j <= n + i - 1; j++) {
                // Condition to print spaces
                if (j <= n - i) {    
                    System.out.print(" ");
                }
                // 
                else {
                    System.out.print(num);

                    // condition for half inc and then dec 
                    if (j < n) {
                        num++;
                    } else {
                        num--;
                    }
                }
            }

            System.out.println(); // next line
        }
    }
}
