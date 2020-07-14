import java.util.*;
public class EmailApp{
	private String firstname=null;
	private String lastname=null;
	private String password;
	private String department;
	private int mailBoxCapacity=500;
	private String email;
	private int defaultPsswordLenghth=10;
	private String collegeSuffix = "kiet.edu";
	
	EmailApp(){
		
	}
	EmailApp(String firstname,String lastname){
		
		this.firstname="surbhi";
		this.lastname="mittal";
		
		this.department=setDept();
		System.out.println("Department:"+this.department);
		this.password=randomPassword(defaultPsswordLenghth);
		System.out.println("Your password is"+this.password);
		
 	}
	public String getFirstName()
	{
		
		return firstname;
	}
	public void setFirstName(String firstname)
	{
		
		this.firstname=firstname;
	}
	public String getLastName(){
		
		return lastname;
		
	}
	public void setLastName(String lastname)
	{
		this.lastname=lastname;
		
	}
	private String setDept()
	{
		System.out.println("Enter the Department \n 1 for MCA\n 2 for Btech\n 3 for MBA\n  and enter department code");
		Scanner sc = new Scanner(System.in);
		int deptChoice =sc.nextInt();
		if(deptChoice ==1)
		{
			  return "mca";
		}
		else if( deptChoice == 2)
		{
			   return "btech";
			
		}
		else if( deptChoice == 3)
		{
			  return "mba";
			
		}
		return null;
	}
	private String randomPassword(int length)
	{
		
		 String passwordSet="ABCDEFGH0123456!@#$%";
		 char[] password = new char[length];
		 for(int i=0;i<length;i++)
		 {
			  int rando = (int)(Math.random() * passwordSet.length());
			  password[i] = passwordSet.charAt(rando);
			 
		 }
		 return new String(password);
	
	}
	public int getMailCapacity()
	{
		return mailBoxCapacity;
	}
	public void setMailBoxCapacity( int capacity)
	{
		this.mailBoxCapacity=capacity;
	}
	public String getPassword()
	{
		return password;
	}
	public void changePassword(String password)
	{
		this.password=password;
	}
	
	void display()
	{
		email = getFirstName().toLowerCase()+ "." +getLastName().toLowerCase()+ "@" + this.department + collegeSuffix;
	    System.out.println("Displaying all information and are as follows:" + "\n Display name:"+ getFirstName() + " " +getLastName()+ "  "
		   +"\n MailBox capacity :" + mailBoxCapacity + "mb" + "\nYour mail id is " +email);
	
	}
	public static void main(String[] args)
	{
		 String lastname = null;
		 String firstname = null;
		 String email = null;
		 
		 EmailApp e = new EmailApp(firstname,lastname);
		 Scanner sc = new Scanner (System.in);
		  
		  System.out.println("Enter first name");
		  String fname = sc.next();
		  e.setFirstName(fname);
		   
		   System.out.println("Enter last name");
		   String lname = sc.next();
		   e.setLastName(lname);
		   e.display();
	}
		

}

