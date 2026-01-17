package mapInterfaceMethods;
/*
 Create an Employee class with fields id, name, and salary.
Store employees in a TreeSet such that they are sorted by:
1.	salary (ascending)
2.	name (ascending) if salary is same    Use a Comparator, Avoid duplicate employees logically
 */
import java.util.*;
class Employee{
private int eid;
private String name;
private int sal;
public Employee(int eid, String name, int sal) {
	this.eid = eid;
	this.name = name;
	this.sal = sal;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
}
class SortBySal implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2)
	{
		if(e1.getSal()>e2.getSal())
		{
			return 1;
		}
		else if(e1.getSal()<e2.getSal())
		{
			return -1;
		}
		return 0;
	}
	
}

public class Q7 {

	public static void main(String[] args) {
		Employee e1=new Employee(2,"A",10000);
		Employee e2=new Employee(3,"B",40000);
		Employee e3=new Employee(1,"D",30000);
		Employee e4=new Employee(5,"E",20000);
		Employee e5=new Employee(4,"C",50000);

		SortBySal s=new SortBySal();
		TreeSet<Employee> t=new TreeSet<Employee>(s);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println("sort  Employee List using salary");
		for(Employee e:t)
		{
			System.out.println("id = "+e.getEid()+" name "+e.getName()+" salary "+e.getSal());
		}

	}

}
