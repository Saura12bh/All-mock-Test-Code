public class RJQ3 {

    public static void main(String[] args) {
        String str = "Java is fun";

        String result = "";
        String word = "";
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {

                for (int j = word.length() - 1; j >= 0; j--) {
                    result = result + word.charAt(j);
                }
                result = result + " "; 
                word = "";           
            }
            else {
                word = word + ch;    
            }
        }
        for (int j = word.length() - 1; j >= 0; j--) {
            result = result + word.charAt(j);
        }

        System.out.println(result);
    }
}
