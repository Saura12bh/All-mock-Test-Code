/*
 5)	Notification System Using Polymorphism. Design a notification system where different types of notifications can be sent using a common interface.
Create a base class Notification with a method send().
Create two subclasses:
EmailNotification
SMSNotification
Override the send() method in each subclass to display a message specific to that notification type.In the main class, invoke the send() method polymorphically using a Notification reference.
 */

//create interface  
interface Notification{
	void send();
}
//create child class implement Notification and override its method
class EmailNotification implements Notification
{
	public void send()
	{
		System.out.println("I am EmailNotification class send method");

	}
}

//create child class implement Notification and override its method
class SMSNotification implements Notification
{
	public void send()
	{
		System.out.println("I am SMSNotification class send method");
	}
}

public class Q5 {
	public static void main(String  x[]) {

		 Notification n=null;
		 
		 //create object of emialnotifaction and call its send method
		 n=new EmailNotification();
		 n.send();

	      //create object of SMSNofi and call its send method
		 n=new SMSNotification();
		 n.send();
	}
}

