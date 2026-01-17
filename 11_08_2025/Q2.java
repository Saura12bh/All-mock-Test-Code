/*Q2. Write a java program to print this pattern. 
           1 
  	1  0  1 
     2  1  0  1  2  i=2
   3  2  1 0  1  2  3 
4  3  2  1  0  1  2  3  4 */
public class Q2 {
    public static void main(String[] args) {
        int n = 4; // last number 4 row<=5

        for (int i = 0; i <=n; i++) {            // rows 2<3   0  1   2   3  4 
            for (int j = 0; j <= 2 * n; j++) {   // columns  n=8  0 <4-2 =2
                if (j < n - i || j > n + i) {          //i=1 j=0 3  s1  j=1 1<3 s2  j=3<3    j=4  j=5  j=6 6>5 =>true
                    System.out.print("  ");            // spaces
                } else {
                    // topmost row to print single "1"
                    if (i == 0) {   
                        System.out.print("1 ");  // prints center 1 for first row
                    } else {   //  5<=4
                        if (j <= n) {                           // 3<=4  4<=4 true  5<=4
                            System.out.print((n - j) + " ");    //4-4=0
                        } else {
                            System.out.print((j - n) + " ");   //6-4=2
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
