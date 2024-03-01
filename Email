package email;

import java.util.Scanner;

public class Email 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the FIRSTNAME:");
	String fname=sc.nextLine();
	System.out.println("Enter the LASTNAME:");
	String lname=sc.nextLine();
	System.out.println("Enter the choice \n1.FOR GETTING EMAIL \n2.FOR CHANGE PASSWORD \n 3.FOR MAILBOX CAPACITY \n 4.FOR ALTER EMAIL \n 5.FOR GETTING A PASSWORD");
	int choice=sc.nextInt();
	if(choice==1)
	{
	email_project mail=new email_project(fname,lname);
	mail.setAlternateEmail(fname.substring(0,2)+lname.substring(0,2)+"@gmail.com");
	System.out.println(mail.getAlterEmail());
	}
	
}
}
