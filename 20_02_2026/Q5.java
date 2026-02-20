/*Q5. Write a Java program that takes a string and stores each character with its frequency using
a Map.
Input
String: "programming"
Output : p → 1 r → 2 o → 1 g → 2 a → 1 m → 2 i → 1 n → 1
 */
import java.util.*;

public class Q5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
	
	//to store  character with its frequencty
        HashMap<Character,Integer> hm =new HashMap<>();
	
        
        for(int i=0;i<str.length();i++) {
          char ch=str.charAt(i); // count frequency using count variable  //programming
          Integer cnt=hm.get(ch);//p 1 r 2 o 1 g 1  
	  if(cnt==null)
	  {
	   cnt=0;
	  }
           cnt=cnt+1;
	  hm.put(ch,cnt);   
	  }

        Set<Map.Entry<Character,Integer>> ent=hm.entrySet();
        System.out.println("Character Frequencies:");
        //print char with freq
	for(Map.Entry<Character, Integer> obj :ent) {
            System.out.println(obj.getKey() + "=" + obj.getValue());
        }

    
    }
}