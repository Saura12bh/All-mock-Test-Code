/*
Q8. You are given a list of student objects with id, name, and marks. Write a Java program to sort the list:
1. By descending marks
2. If marks are equal, sort by ascending name. */
import java.util.*;
// Student class
class Student {
    int id;
    String name;
    int marks;
	//consutor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

	//getter setter
   public void setID(int id)
	{
	 this.id=id;
	}
  public int  getId()
	{	
	  return id;
	}
   public void setName(String name)
	{
	 this.name=name;
	}
  public String  getName()
	{	
	  return name;
	}
   public void setMarks(int marks)
	{
	 this.marks=marks;
	}
  public int  getMarks()
	{	
	  return marks;
	}
    public String toString() {
        return "Id=> " + id + ", Name=> " + name + ", Marks=> " + marks;
    }
}

// Comparator class to sort students
class SortStd implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        // First, compare marks in descending order
        if (s2.marks > s1.marks) {
            return 1;
        } else if (s2.marks < s1.marks) {
            return -1;
        } else {
            // If marks are equal, compare names in ascending order
            return s1.name.compareTo(s2.name);
        }
    }
}
// Main class
public class Q8 {
    public static void main(String x[]) {
      Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // consume newline

            Student s = new Student(id, name, marks);
            students.add(s); // add to list
        }
	
	//create object of comaprator class and call using sort method        
          SortStd obj=new SortStd();	
	 Collections.sort(students,obj);

        // After sorting
	System.out.println("After  sorting");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
