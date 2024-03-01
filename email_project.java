package email;
import java.util.*;
public class email_project 
{
  private String firstname;
  private String lastname;
  private String password;
  private String dept;
  private int mailBoxCapacity=500;
  private String alter_email;
  private int defaultPasswordLength=10;
  private String email;
  private String companySuffix="elite.com";
  public email_project(String firstname,String lastname)
  {
	  this.firstname=firstname;
	  this.lastname=lastname;
	 // System.out.println("EMAIL CREATED:"+" "+this.firstname+this.lastname+"@gmail.com");
      this.dept=setDept();
    //  System.out.println("Department : "+this.dept);
      this.password=randPassword(defaultPasswordLength);
     // System.out.println("Your Password is:"+this.password);
      email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+dept+"."+companySuffix;
  //    System.out.println("Your email is:"+email);
  }
  private String setDept()
  {
	 System.out.println("DEPARTMENT CODE\n 1.FOR SALES \n 2.FOR DEPARTMENT \n 3.FOR ACCOUNTANT \n 0.FOR NONE \nEnter the Department:");
	 Scanner sc=new Scanner(System.in);
	 int deptChoice= sc.nextInt();
	 if(deptChoice==1) return "SALES";
	 else if(deptChoice==2) return "DEVELOPMENT";
	 else if(deptChoice ==3) return "ACCOUNTANT";
	 else return "";
  }
  private String randPassword(int len)
  {
	  String passwordSet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
	  char[] password=new char[len];
	  for(int i=0;i<len;i++)
	  {
		 int rand=(int) (Math.random()*passwordSet.length());
		 password[i]=passwordSet.charAt(rand);
	  }
	  return new String(password);
  }
  public void setMailBoxCapacity(int capacity)
  {
	  this.mailBoxCapacity=capacity;
  }
  public void setAlternateEmail(String altemail)
  {
	  this.alter_email=altemail;
  }
  public void changePassword(String passWord)
  {
	  this.password = passWord;
      System.out.println("Password updated successfully!");
  }
  public int getMailBoxCapacity()
  {
  return mailBoxCapacity;
  }
  public String getAlterEmail()
  {
	  return alter_email;
  }
  public String getPassword()
  {
	  return password;
  }
}
