/*
 Q9. Write a Java program using ArrayList, HashMap, and TreeMap to: 
1. Store student names and their marks in 3 subjects. 
2. Calculate total marks for each student and store in a HashMap. 
3. Sort students in ascending order of their total marks using a TreeMap. 
4. Display only those students whose average marks are greater than 60. 
5. Remove students who have scored less than 40 in any subject from the list and re-display 
the result. */

import java.util.*;
class Q9{
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<int[]> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.next();
            names.add(name);

            int[] m = new int[3];
            System.out.println("Enter marks in 3 subjects: ");
            for (int j = 0; j < 3; j++) {
                m[j] = sc.nextInt();
            }
            marks.add(m);
        }

        // Step 2: Store total marks in HashMap
        HashMap<String, Integer> totalMarks = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sum = marks.get(i)[0] + marks.get(i)[1] + marks.get(i)[2];
            totalMarks.put(names.get(i), sum);
        }

        // Step 3: Sort using TreeMap
        TreeMap<Integer, String> sorted = new TreeMap<>();
        Set<Map.Entry<String, Integer>> ent = totalMarks.entrySet();
        for (Map.Entry<String, Integer> entry : ent) {
            sorted.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nStudents sorted by total marks (Ascending):");
        Set<Map.Entry<Integer, String>> ent1 = sorted.entrySet();
        for (Map.Entry<Integer, String> ent2 : ent1) {
            System.out.println(ent2.getValue() + " - Total: " + ent2.getKey());
        }

        // Step 4: Display students with average > 60
        System.out.println("\nStudents with average > 60:");
	 Set<Map.Entry<Integer, String>> ent2 = sorted.entrySet();
        for (Map.Entry<Integer, String> ent3 : ent2) {
            double avg = ent3.getKey() / 3.0;
            if (avg > 60) {
                System.out.println(ent3.getValue() + " - Average: " + avg);
            }
        }

    }
}
