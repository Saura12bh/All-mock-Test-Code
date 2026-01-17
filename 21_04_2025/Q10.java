/*Q10. Find the Duplicate Elements in Array
Description: Find all the duplicate elements in an array.
Input: [1, 2, 3, 4, 5, 1, 3]
Output: [1, 3]*/
import java.util.*;
public class Q10{
  public static void main(String x[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Size of Array : ");
  int size=sc.nextInt();
  int[] a = new int[size];
  System.out.println("Enter Elements in Array :");
  for(int i=0;i<a.length;i++){
     a[i]=sc.nextInt();
  } 
  boolean isduplicate=false;
  System.out.println("Duplicate Elements from the Array : ");
  for(int i=0;i<a.length;i++){            // points to the first element of an Array 
    for(int j=i+1;j<a.length;j++){        // this loop points to the second element of an array 
        if(a[i] == a[j]){                 // check the first element and second element is same if Yes then print it  
            System.out.println(a[i]+" ");
            isduplicate=true;
        }
     } 
  }
  if(! isduplicate)
    System.out.println("No Duplicate Element's In the Array... ");

  }
}