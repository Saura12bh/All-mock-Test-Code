

public class Q2 {
    public static void main(String[] args) {
        int rows=5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces for right alignment
            for (int s = rows; s > i; s--) {
                System.out.print("   ");  // 3 spaces
            }

            if (i % 2 != 0) { 
                // Odd rows -> Letters
                for (char ch = 'A'; ch < 'A' + i; ch++) {
                    System.out.print(ch + "  ");
                }
                for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                    System.out.print(ch + "  ");
                }
            } else { 
                // Even rows -> Numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + "  ");
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + "  ");
                }
            }
            System.out.println();
        }

    }
}
