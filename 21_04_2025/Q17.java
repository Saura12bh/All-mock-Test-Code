/*
Q17. Find the Kth Smallest Element in an Array
•	Description: Find the kth smallest element in an unsorted array.
•	Input: [12, 3, 5, 7, 19], k = 2
•	Output: 5
*/
import java.util.Scanner;

public class Q17{
    public static void main(String[] x) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] a= new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the k value ");
        int k= scanner.nextInt();
	int temp;
	//sorting
	for(int i=0;i<n;i++)
	{
	  for(int j=i+1;j<n;j++)
		{
		if(a[i]>a[j]){
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
	}
        
        int cnt=1;
  	for(int i=0;i<n-1;i++)
	{
	if(cnt==k)
	{
	System.out.println(k+" element is "+a[i]);
	}
	if(a[i]!=a[i+1])
	{
	cnt++;
	}
	}
}
}