/*Q8. Given a string, find the first non-repeated character using LinkedHashMap.
Input: "swiss"
Output: 'w'
Hint: Track character counts and preserve insertion order using LinkedHashMap.*/
import java.util.*;
public class Q8{
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character,Integer>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);               //eg=>str=>swiss => ch=s

            if (map.containsKey(ch)) {   //map.conatinskey(s)=>false
                int count = map.get(ch);
                map.put(ch, count + 1);
            }                     
            else {                 
                map.put(ch, 1);          //map.put(s,1);=>s as key and 1 as value
            }
        }

	Set<Map.Entry<Character,Integer>> ent=map.entrySet();
        for (Map.Entry<Character, Integer> obj:ent )    
	{
            if (obj.getValue() == 1) {
                System.out.println("First non-repeated character: " +obj.getKey());
		break;
            }
        }

    }
}