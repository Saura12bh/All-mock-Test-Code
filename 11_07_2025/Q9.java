/*Q9. Given a List<Integer> of student scores, write a Java program to:
• Sort the scores in descending order.
• Print the top 3 highest unique scores.
Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
Expected Output: 92, 90, 86
*/
import java.util.*;
public class Q9{
    public static void main(String x[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of scores:");
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<Integer>();

        System.out.println("Enter "+n+" scores:");
        for (int i=0;i<n;i++) {
            l.add(sc.nextInt());
        }

        //  Sort scores in descending order
        Collections.sort(l,Collections.reverseOrder());	
	
	System.out.println("After sortig in reverseOrder");
	for(Integer obj:l)
	{
	  System.out.println(obj);
	}

        //  Create a new list for top 3 unique scores
        List<Integer> l2 = new ArrayList<Integer>();

        for (int ele:l) {   
            if (l.contains(ele)) {    z
            }
            if (l2.size() == 3) {  //1
                break;
            }
        }

        // Print the top 3 unique scores
        System.out.println("Top 3 unique highest scores:");
	  System.out.println(l2);
	   
    }
}