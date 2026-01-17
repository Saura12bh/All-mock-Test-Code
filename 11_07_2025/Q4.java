import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter elements of second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // ===== Union =====
        int[] union = new int[n1 + n2];
        int uCount = 0;

        // Add all elements of arr1 to union (checking duplicates manually)
        for (int i = 0; i < n1; i++) {
            boolean found = false;
            for (int j = 0; j < uCount; j++) {
                if (arr1[i] == union[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                union[uCount++] = arr1[i];
            }
        }

        // Add elements of arr2 to union (if not already present)
        for (int i = 0; i < n2; i++) {
            boolean found = false;
            for (int j = 0; j < uCount; j++) {
                if (arr2[i] == union[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                union[uCount++] = arr2[i];
            }
        }

        // ===== Intersection =====
        int[] intersection = new int[Math.min(n1, n2)];
        int iCount = 0;

        for (int i = 0; i < n1; i++) {
            boolean isCommon = false;
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    isCommon = true;
                    break;
                }
            }

            if (isCommon) {
                // Check if already added to intersection
                boolean alreadyAdded = false;
                for (int k = 0; k < iCount; k++) {
                    if (intersection[k] == arr1[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }

                if (!alreadyAdded) {
                    intersection[iCount++] = arr1[i];
                }
            }
        }

        // Print Union
        System.out.print("Union of arrays: [ ");
        for (int i = 0; i < uCount; i++) {
            System.out.print(union[i]);
            if (i != uCount - 1) System.out.print(" , ");
        }
        System.out.println(" ]");

        // Print Intersection
        System.out.print("Intersection of arrays: [ ");
        for (int i = 0; i < iCount; i++) {
            System.out.print(intersection[i]);
            if (i != iCount - 1) System.out.print(" , ");
        }
        System.out.println(" ]");

    }
}
