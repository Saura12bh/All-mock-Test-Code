/* Q7. Write a java program to merge two arrays.
Input - First Array :- 1 2 3 4 5
 Second Array :- 6 7 8 9 10
Output - 1 10 2 9 3 8 4 7 5 6*/
import java.util.*;
public class Q7{
    public static void main(String[] x) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the arrays:");
        int n = sc.nextInt();
	
	//create 3 array 
        int a1[]=new int[n];
        int a2[]=new int[n];
        int  m[]=new int[2*n]; // third array for merged result

	//1st array
        System.out.println("Enter elements of first array:");
        for(int i=0;i<n;i++) {
            a1[i]=sc.nextInt();
        }
	
	//2nd Array
        System.out.println("Enter elements of second array:");
        for(int i=0;i<n;i++) {
            a2[i]=sc.nextInt();
        }

        // Merge a1 and a2 in m
        int index=0;
        for(int i=0;i<n;i++) {       
            m[index]=a1[i];  //merging a1 in m in alternate position menas a1=>1  then a2=1 like this
            index++;
            m[index]=a2[n-1-i]; //a2[5-1-0]=>4
            index++;
        }

        //  Print merged array
        System.out.println("Merged array:");
        for (int i=0;i<m.length;i++) {
            System.out.print(m[i] + " ");
        }
    }
}