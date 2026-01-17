/*
6)	Food Billing System Using Java Collection
Design and implement a menu-driven Food Billing System in Java using Object-Oriented Programming and the Java Collection Framework.
     Requirements:
1.	Create a class named Food with the following data members:
o	fid – Food ID
o	fname – Food Name
o	fprice – Food Price
o	fcategory – Food Category
2.	Use a Java Collection (ArrayList) to store objects of the Food class.
The collection should store details of food items.
3.	Implement a menu-driven program using a do-while loop and switch-case to perform the following operations:
1. Add All Food Details
2. Display All Food Details
3. Display Bill Details

Calculate and display:
Bill without GST
Bill with 18% GST
Bill calculation must be performed using the Collection of Food objects.

*/

import java.util.*;
class Food {
    private int fid;
    private String fname;
    private double fprice;
    private String fcategory;
public Food(int fid, String fname, double fprice, String fcategory) {
        this.fid = fid;
        this.fname = fname;
        this.fprice = fprice;
        this.fcategory = fcategory;
    }
    public int getFid() {
        return fid;
    }
    public String getFname() {
        return fname;
    }
    public double getFprice() {
        return fprice;
    }
    public String getFcategory() {
        return fcategory;
    }
}

public class Q6{
    public static void main(String  x[]) {
        Scanner sc = new Scanner(System.in);
	//create arrayList with Food class
        ArrayList<Food> foodList = new ArrayList<>();
        int ch;
        do {
            System.out.println("\n---Food billing System----");
            System.out.println("1. Add All Food Details");
            System.out.println("2. Display All Food Details");
            System.out.println("3. Display Bill Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Food ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Food Name: ");
                    String name = sc.next();
                    System.out.print("Enter Food Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Food Category: ");
                    String category = sc.next();
                    
		  //food madhe details kelay	  
		   Food f=new Food(id, name, price, category);
		  //foodList madhe food cha object add
                    foodList.add(f);
                    System.out.println("Food Added Successfully!");
                    break;

                case 2:
                         System.out.println("\n--- Food Details ---");
                        for (Food f1 : foodList) {
                            System.out.println( f1.getFid() + "\t" +f1.getFname() + "\t" +f1.getFprice() + "\t" +
                                    f1.getFcategory()
                            );
                    }
                    break;

                case 3:
                        double total = 0;
                        for (Food f2 : foodList) {
                            total = total + f2.getFprice();
                        }

                        double gst = total * 0.18;
                        double finalBill = total + gst;
                        System.out.println("Bill Without GST =" + total);
                        System.out.println("GST (18%)        =" + gst);
                        System.out.println("Bill With GST    =" + finalBill);

                    break;

                case 4:
                    System.out.println(" exit successdfully");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 4);

    }
}
