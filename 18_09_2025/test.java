import java.util.*;
public class test{
public static void main(String x[])
{

  LinkedHashMap<String,Integer> lm=new LinkedHashMap<>();

  lm.put("A",10);
  lm.put("B",40);
  lm.put("C",20);
  lm.put("D",30);
  lm.put("E",5);

System.out.println("Origanl hashMap ");
Set<Map.Entry<String,Integer>> ent=lm.entrySet();
for(Map.Entry<String,Integer> obj:ent)
  {
    String s=obj.getKey();
    Integer val=obj.getValue();
    System.out.println(s+" \t "+val);
  }


}
}