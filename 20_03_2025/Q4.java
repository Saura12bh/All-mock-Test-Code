/* 
Q4. Write a java program to print this pattern.
A B C D E F
 A B C D E
  A B C D
   A B C
    A B
     A 
*/
public class Q4{
    public static void main(String x[]) {
	for (int i = 1; i <= 6; i++) {     
            char ch = 'A';                 //in inner for loop char declare beaz after new line it start form A always
            for (int j = 1; j <= 6; j++) {
                if (j >= i ) {               //condtion meaning j alyas grater than it start from i value to j
                    System.out.print(" " + ch);  
                    ch++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}