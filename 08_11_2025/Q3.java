/* 
Q3. Create a program that calculates the net annual bonus for employees based on their salary
and performance rating.

If the employee rating is:
• 5 → Bonus = 20% of salary
• 4 → Bonus = 15% of salary
• 3 → Bonus = 10% of salary
• otherwise → Bonus = 5% of salary

Also, calculate tax on the bonus (10%).

Requirements:
• Use a POJO Employee class with fields id, name, salary, rating.
• Create an abstract class BonusCalculator with an abstract method calculateBonus(Employee e).
• Create an interface Taxable with a method applyTax(double amount).
• Implement logic in a subclass that extends BonusCalculator and implements Taxable.
*/

import java.util.*;

// pojo class
class Employee {
    int id;
    String name;
    double salary;
    int rating;

    public Employee(int id, String name, double salary, int rating) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }
}

// Abstract Class
abstract class BonusCalculator {
    abstract double calculateBonus(Employee e);
}

//  Interface
interface Taxable {
    double applyTax(double amount);
}


public class Q3 {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        //input form user
        System.out.print("enter employee id => ");
        int id = sc.nextInt();
        System.out.print("enter employee name=> ");
        String name = sc.nextLine();

        System.out.print("enter salary => ");
        double salary = sc.nextDouble();

        System.out.print("enter performance rating (1-5) => ");
        int rating = sc.nextInt();

        Employee e = new Employee(id, name, salary, rating);

         System.out.println("Employee ID => " + e.id);
        System.out.println("Employee Name => " + e.name);
        System.out.println("Salary  =>" + e.salary);
        System.out.println("Rating =>" + e.rating);
       }
}
