/*WAP to remove all duplicated characters from given string ?*/
import java.util.*;
public class StringApp{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String s=sc.next();
System.out.println("Orignal String Before the duplicate charater=>"+s);

String s1=" ";
for(int i=0;i<s.length();i++)
{
  char ch=s.charAt(i);
  for(int j=1;j<s.length();j++)
  {
   if(s.charAt(j)==ch)
    {
      break;
    }
   else
    {
     s1=s1+ch;
      break;
    }
  }
}
System.out.println("String after removing duplicate charater from String => "+s1);
}
}