class A{
static int n;//0  1  2  3
int m;//0 1   0  1  0  1
public A()
{
n++;
m++;
System.out.println(n);//1  2   3
 System.out.println(m);//1  1  1
}
}
public class App{
public static void main(String x[])
{
  new A();
  new A();
  new A();

}
}