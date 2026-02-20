/*
Q1. Write a java program to print this pattern.
1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1
*/

public class Q1{
  public static void main(String args[]) {

        for (int i = 1; i <= 7; i++) {    //upto 7 row       
	   int num = i;   //jya aplya i madhe number to store
           
            if (i > 4) {    //to check if i>4 then print lower part 
                num = 8-i;  // second for print lower value   if i=5 num=8-5 =>3
            }

            for (int j = 1; j <= num; j++) {  //it start from 1 to num 
                System.out.print(num);   //print the num value 1,2,3,4
                if (j < num) {            
                    System.out.print(" * ");
                }
            }

            System.out.println();    //next line
        }
    }
}

