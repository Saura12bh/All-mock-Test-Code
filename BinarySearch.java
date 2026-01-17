public class BinarySearch {
    public static void main(String x[]) {

        int a[] = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int key = 40;

        int low = 0;
        int high = a.length - 1;
        int mid;
        boolean found = false;

        while (low <= high) {

            mid = low + (high - low) / 2; // safe formula

            if (a[mid] == key) {
                found = true;
                break;
            }
            else if (a[mid] > key) {
                high = mid - 1;   
            }
            else {
                low = mid + 1;    
            }
        }

        if (found == true) {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}
