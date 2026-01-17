import java.util.*;
public class PQ{
public static void main(String x[])
{
	PriorityQueue<Integer> p=new PriorityQueue<>();
	p.add(6);
	p.add(1);
	p.add(2);
	p.add(4);
	
	for(Integer obj:p)
	{
	System.out.println(obj);
	}
}
}