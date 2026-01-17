
import java.io.*;
import java.util.*;
/*
 8)	Create a Product class with fields productId, productName, and price.
Write a program to serialize a Product object and store it in a file. (Implement Serializable,Use ObjectOutputStream) 

 */
class Product implements Serializable{
	private int pid;
	private String pname;
	private int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Q8 {

	public static void main(String  x[]) throws Exception{
	Scanner sc=new Scanner(System.in);
		//to target file 
		FileOutputStream f=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java Program\\Core java\\All_test\\15_01_2026\\abc.txt");
		ObjectOutputStream os=new ObjectOutputStream(f);  //pass ref of FOS 
		

		System.out.println("Enter Name Id Price");
		String pname=sc.nextLine();
		int pid=sc.nextInt();
		int price=sc.nextInt();
		Product p=new Product();
		p.setPid(pid);
		p.setPname(pname);
		p.setPrice(price);
		
		os.writeObject(p);
		System.out.println("Product insert Successfully");
		os.close();
		f.close();
	}
}
