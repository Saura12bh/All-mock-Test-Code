/*Q2. Write a java program to print this pattern.
1  2   3  4  5  =>0
10 9   8  7  6  =>1
11 12 13 14 15  =>2
20 19 18 17 16  =>3
21 22 23 24 25  =>4
*/
public class Q2 {
    public static void main(String[] x) {
        int r=5;
        int n=1; 
        for (int i = 0; i < r; i++) {
            if (i%2==0) { //even rows 
                for (int j = 0; j < r; j++) {
                    System.out.print(n + "\t");   //serial print no and incremnet by one
                    n++; 
                }
            } else {
                int n1=n+r-1;    //n1=6+5-1 =>10
                for (int j=0;j<r;j++) {
                    System.out.print((n1-j)+"\t");  //10,9,8,7,6   
                }
                n=n1+1; //inc by 1
            }
            System.out.println();  //new line 
        }
    }
}
