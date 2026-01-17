/*
Q10. You have a list of Department objects. Each department has a list of Employee objects. An
Employee has fields: id, name, salary.
Sort all employees across all departments based on the following rules:
• First by descending salary.
• If salaries are equal, sort by ascending name.
• If names are equal, sort by ascending id.
Requirement:
Use Comparator and Streams to collect the sorted employees into a single list.*/
import java.util.*;
class Emp         //Emp Pojo class
{  private int id;
   private String name;
   private int sal;
   
   public Emp()    //default con
   {
   }
	
   public Emp(String name,int id,int sal)  //param con
   {  this.name=name;
      this.id=id;
	  this.sal=sal;
   }

    //all getter setter
   public void setId(int id)
   { this.id=id;
   }
   public int getId(){
     return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName(){
      return name;
   }
   public void setSal(int sal)
   { this.sal=sal;
   }
   public int getSal()
   {  return sal;
   }
}

//Sort by ID  using Sal
class SortEmpBySal implements Comparator 
{
	  public int compare(Object obj1,Object obj2)
	  { Emp e1=(Emp)obj1;
	    Emp e2=(Emp)obj2;
		if(e1.getSal()>e2.getSal())
		{ return 1;
		}
		else if(e1.getSal()<e2.getSal())
		{ return -1;
		}
		else{
			return 0;
		}
		
	  }
}
public class Q10
{
    public static void main(String x[])
	{
	   //cretae arrayList and pass data throw con
	   ArrayList al = new ArrayList();
	   al.add(new Emp("A",1,100));
	   al.add(new Emp("B",3,10));
	   al.add(new Emp("C",2,1100));
	   al.add(new Emp("D",4,500));
	   al.add(new Emp("E",5,600));
	   
	   //Display Orignal Data
	   System.out.println("Display Employee data without sorting");
	   for(Object obj:al)
	   { Emp p=(Emp)obj;
	     System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSal());
	   }

	  //create obj of SortById method and call Collection.sort() method
	  SortEmpById n=new SortEmpById();
	  Collections.sort(al,n);

	   System.out.println("Display Emp data  sorting  Using Id ");
	   for(Object obj:al)
	   { Emp p=(Emp)obj;
	     System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSal());
	   }

	  //create obj of SortById method and call Collection.sort() method
	  SortEmpBySal s=new SortEmpBySal();
	  Collections.sort(al,s);
	
	   System.out.println("Display Product data  sorting  Using  Salary ");
	   for(Object obj:al)
	   { Emp p=(Emp)obj;
	     System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSal());
	   }

	   
	}
} 
