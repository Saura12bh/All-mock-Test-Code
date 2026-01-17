import java.util.*;
class UserEx extends IOExcption
{
  void voteValidate()
  { 
   System.out.println("You Can not vote");
  }
}
class CheckVote
{
  void check(int age)
  {
	if(age<18)
	{
	UserEx e=new UserEx();
	throw e;
	}
	else
	{
	 System.out.println("you can not vote");
	}
  }
}
class Main {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
       try{
	System.out.println("Enter Your age for vote checking");
       int n=sc.nextInt();
	CheckVote  c=new CheckVote();
	c.check();
    	}catch(UserEx e)
	{
	  System.out.println(e);
	}
	finally
	{
	System.out.println("Execute SuccessFully");
	}
}
}