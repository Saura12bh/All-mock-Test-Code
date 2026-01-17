/*Q6. Create class name as ArrayOperation with method name as setArray()  and create its Two 
child classes  name as Unique , MergeArray. We need to inherit the ArrayOperation class in 
Unique , MergeArray and create method. and write the logic. 
 1. Unique Class : - 
 Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10  
Output : 
 All unique elements in the array are: 3, 20, 12, 10  
   2. MergeArray class :- 
 Input -First Array :- 1 2 3 4 5 
              Second Array :-  6 7 8 9 10  
 Output - 1 10 2 9 3 8 4 7 5 6 */

import java.util.Scanner;
// Parent class
class ArrayOperation {
    int[] arr1, arr2;

    void setArray(int[] a) {
        arr1 = a;
    }
    void setArray(int[] a, int[] b) {
        arr1 = a;
        arr2 = b;
    }
}

// Child class for Unique logic
class Unique extends ArrayOperation {

    void printUnique() {
        System.out.print(" unique elements in the array are: ");
        boolean first = true;

        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                }
            }
            if (count == 1) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(arr1[i]);
                first = false;
            }
        }
        System.out.println();
    }
}

// Child class for Merge logic
class MergeArray extends ArrayOperation {

    void printMerged() {
        int i = 0;
        int j = arr2.length - 1;

        System.out.print("Merged Array: ");
        while (i < arr1.length && j >= 0) {
            System.out.print(arr1[i++] + " " + arr2[j--] + " ");
        }
        System.out.println();
    }
}

// Driver class
public class Q6 {
    public static void main(String  x[]) {
        Scanner sc = new Scanner(System.in);

        // Input for Unique class
        System.out.print("Enter size of Unique array: ");
        int n = sc.nextInt();
        int[] uniqueArr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            uniqueArr[i] = sc.nextInt();
        }

        Unique u=new Unique();
        u.setArray(uniqueArr);
        u.printUnique();

        // Input for MergeArray class
        System.out.print("Enter size of first array for merging: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter " + size1 + " elements:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array for merging: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter " + size2 + " elements:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        MergeArray Obj = new MergeArray();
        Obj.setArray(arr1, arr2);
        Obj.printMerged();

    }
}