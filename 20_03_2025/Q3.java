/*
Q3.Write a java program to print this pattern.
# 1
# 2
# 3 # 3
# 4 # 4
# 5 # 5 # 5
# 6 # 6 # 6
*/
public class Q3{
    public static void main(String x[]) {
        int n=1;
	for (int i = 2; i <=7; i++) {    //6 row        
           for (int j = 1; j <=i/2; j++) {  //6 clm
                System.out.print(" # "+n);
            }
	     n++;
            System.out.println();
        }
    }
}