import java.util.*;
class Emp
{
private int id;
private String name;
private int sal;

Emp(int id ,String name,int sal)
{
this.id=id;
this.name=name;
this.sal=sal;
}
public void setId(int id)
{
this.id=id;
}
public int getId()
{
return id;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void setSal(int sal)
{
this.sal=sal;
}
public int getSal()
  {
return sal;
}

}
public class Q1{
public static void main(String x[])
{
ArrayList<Emp> al=new ArrayList<>();
Emp e1=new Emp(1,"a",1000);
Emp e2=new Emp(4,"b",1000);
Emp e3=new Emp(2,"c",1000);
Emp e4=new Emp(3,"d",1000);
Emp e5=new Emp(5,"e",1000);
al.add(e1);
al.add(e2);
al.add(e3);
al.add(e4);
al.add(e5);

Collection.sort(al,cmp);
}
}



















