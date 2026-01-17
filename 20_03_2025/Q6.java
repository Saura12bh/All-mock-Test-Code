/*
Q6. Write a Java program to find the union and intersection of two arrays.
Explanation:
The union of two arrays includes all unique elements from both arrays.
The intersection of two arrays includes only the elements that are present in both arrays.
Array 1: {1, 3, 4, 5, 7}
Array 2: {2, 3, 5, 6}
Union: {1, 2, 3, 4, 5, 6, 7}
Intersection: {3, 5} 

*/

import java.util.*;
  public class Q6{
   public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
     int [] a1 = new int[5]; 
     int [] a2 = new int[5];

     System.out.println("Enter Elements 5 in Array 1 :");    // inser elemnts in Array 
     for(int i=0;i<a1.length;i++){
       a1[i]=sc.nextInt();
     } 

     System.out.println();             // New Line
     System.out.println("Enter Elements 5 in Array 2 :");
     for(int i=0;i<a2.length;i++){
       a2[i]=sc.nextInt();
     }  
     

// Display Original Array Elemnts 

     System.out.println();             // New Line
     System.out.println("Original Array ONE :");
     for(int i=0;i<a1.length;i++){
       System.out.printf("%d\t",a1[i]);
     } 

     System.out.println();             // New Line
     System.out.println("Original Array TWO :");
     for(int i=0;i<a2.length;i++){
       System.out.printf("%d\t",a2[i]);
     } 

// we can find the intersection of Array

    System.out.println();
    System.out.println("Intersection Elemnts : ");
    int ind=0;
    int res[] = new int[2];

    for(int i=0;i<a1.length;i++){
       for(int j=0;j<a2.length;j++){
          if(a1[i] == a2[j]){
            res[ind++]=a1[i];
            break;
          }
       }
    }


    System.out.println();
    for(int i=0;i<res.length;i++){
      System.out.printf("%d\t",res[i]);
    }
  


// here we can Find Union of a given Array 

  System.out.println();
  System.out.println("Union of a given Array : ");

  int res1[] = new int[10];
  int ind1=0;


  for(int i=0;i<a1.length;i++){
      res1[ind1++]=a1[i];
  }

  for(int i=0;i<a2.length;i++){

      boolean isduplicate=false;

     for(int j=0;j<ind1;j++){       // we can take boolean value to check duplicate elemnt found in a array or not 

        if(a2[i] == res1[j]){
          isduplicate=true;                   
          break;
        }
     }
     if(! isduplicate)     
       res1[ind1++]=a2[i];
  }
    System.out.println();
    for(int i=0;i<ind1;i++){
      System.out.printf("%d\t",res1[i]);
    }
  }
}