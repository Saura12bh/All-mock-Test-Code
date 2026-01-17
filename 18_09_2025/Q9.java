/*
Q9. You are given 3 sorted lists. Find all common elements using HashMap.
Example: Input: List1 = [1, 5, 10, 20, 40, 80] List2 = [6, 7, 20, 80, 100]
List3 = [3, 4, 15, 20, 30, 70, 80, 120] Output: [20, 80]

*/
import java.util.*;
public class Q9{
    public static void main(String x[]) {

	Scanner sc = new Scanner(System.in);	
	List<Integer> list1=new ArrayList<>();
	List<Integer> list2=new ArrayList<>();
	List<Integer> list3=new ArrayList<>();

	// list1 elements 
	System.out.println("Enter five five Number of Elements in List1 : ");

	for(int i=0;i<5;i++){
	   list1.add(sc.nextInt());
	}

	// list2 elements 
	System.out.println("Enter five Number of Elements in List2 : ");
	for(int i=0;i<5;i++){
	   list2.add(sc.nextInt());
	}

	//list3 elements 
	System.out.println("Enter five Number of Elements in List3 : ");
	for(int i=0;i<5;i++){
	   list3.add(sc.nextInt());
	}

	// HashMap to store element counts
        HashMap<Integer, Integer> map = new HashMap<>();

        // Add elements from list1
        for (int num : list1) {
            map.put(num, 1);
        }

        // Update counts for list2
        for (int num : list2) {
            if (map.containsKey(num) && map.get(num) == 1) {
                map.put(num, 2);  //
            }
        }

        // Update counts for list3
        List<Integer> common = new ArrayList<>();
        for (int num : list3) {
            if (map.containsKey(num) && map.get(num) == 2) {
                common.add(num);
            }
        }

        // Print common elements
        System.out.println("Common elements: " + common);
    }
}
