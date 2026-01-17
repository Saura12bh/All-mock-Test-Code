/*Q4.  Write a java program to create pojo class name as Employee with the following properties as 
id, name, email, salary to perform. 
  Case 1: Add 5 Records Of Employee. 
  Case 2: Display All Employee Details. 
  Case 3: Update Employee Record By Name. 
  Case 4: Delete Employee Record By salary. 
  Case 5: Search Employee Record By Id. */

import java.util.ArrayList;
import java.util.Scanner;

// POJO class
class Employee {
    private int id;
    private String name;
    private String email;
    private double salary;

    public Employee(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    // Getters & Setters
    public void setName(String name) 
	{
	 this.name = name;
	 }
    public void setEmail(String email)
	 { 
	this.email = email; 
	}
    public void setSalary(double salary) 
	{ 
	this.salary = salary;
	}

    public int getId()
	 { 
		return id; 
	}
    public String getName()
	 { 
     		return name;
	 }
    public String getEmail()
	 {
		 return email;
	 }
    public double getSalary()
	 { 
		return salary;
	 }
    public String toString() {
        return "Id: " + id + ", Name: " + name +", Email: " + email + ", Salary: " + salary;
    }
}

public class Q4{
    public static void main(String  x[]) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n  Employee Data");
            System.out.println("1. Add 5 Records");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee By Name");
            System.out.println("4. Delete Employee By Salary");
            System.out.println("5. Search Employee By Id");
            System.out.println("6. Exit");
            System.out.println("Enter choice=> ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    for(int i=0;i<5;i++) {
                        System.out.println("Enter details for Employee " + (i+1));  //i+1 start la enter 1st emp details sathi
                        System.out.print("Id: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("Salary: ");
                        double salary = sc.nextDouble();
                        sc.nextLine();
                        employees.add(new Employee(id, name, email, salary));
                    }
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Update: ");
                    String searchName = sc.nextLine();
                    boolean foundUpdate = false;
                    for (Employee emp : employees) {
                        if (emp.getName().equalsIgnoreCase(searchName)) {
                            System.out.print("Enter new name: ");
                            String newName = sc.nextLine();
                            System.out.print("Enter new email: ");
                            String newEmail = sc.nextLine();
                            System.out.print("Enter new salary: ");
                            double newSalary = sc.nextDouble();
                            sc.nextLine();
                            emp.setName(newName);
                            emp.setEmail(newEmail);
                            emp.setSalary(newSalary);
                            foundUpdate = true;
                            System.out.println("Record updated successfully.");
                            break;
                        }
                    }
                    if (!foundUpdate) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                     System.out.print("Enter Salary to Search: ");
                    int sal = sc.nextInt();
                    sc.nextLine();
                    boolean foundSearch = false;
                    for (Employee emp : employees) {
                        if (emp.getSalary() == sal) {
                            System.out.println(emp);
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Id to Search: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    boolean foundSearch = false;
                    for (Employee emp : employees) {
                        if (emp.getId() == searchId) {
                            System.out.println(emp);
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
