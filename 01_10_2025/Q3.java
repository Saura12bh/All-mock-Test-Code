/* Q3. WAP to create two matrix of 3 x 3 and perform matrix multiple on two matrix and store its
result in 3rd matrix.*/
import java.util.*;
public class Q3{
    public static void main(String x[]) {
        Scanner sc=new Scanner(System.in);

	//three matrix initilize
        int a[][]= new int[3][3];
        int b[][]= new int[3][3];
        int res[][]= new int[3][3];

        // Input first matrix
        System.out.println("Enter elements of first 3x3 matrix =>");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
               a[i][j] =sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second 3x3 matrix:");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                b[i][j]=sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i=0;i<3;i++) { // row of m1
            for (int j=0;j<3;j++) { // column of m2
                result[i][j]=0;
                for (int k=0;k<3;k++) { // multiply row * column
                    res[i][j]=res[i][j]+a[i][k] * b[k][j];
                }
            }
        }

 
        // Print the result matrix
        System.out.println("Result of matrix multiplication:");
        for (int i=0;i<3;i++) {
            for (int j=0; j<3;j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
