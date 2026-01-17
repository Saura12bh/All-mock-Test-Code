/*
Q20. Remove Vowels from a String
          Description: Remove all vowels from a given string.
          Input: "hello"
         Output: "hll"
*/
public class Q20 {
    public static void main(String[] args) {
        String input = "hello";
        String str = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                str=str+ch;
            }
        }

        System.out.println("String after removing vowels: " + str);
    }
}
