package email_app;
import java.util.*;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int defaulPasswordLength = 10;
	private String email;
	private String companySuffix = "Xcompany.com";
	private int mailboxCapacity;
	private String alternateEmail;
	
	// constructor to take firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("EMAIL CREATED : "+this.firstName+" "+this.lastName);
		
		// call seDepartment method
		this.department = setDepartment();
		// System.out.println("DEPARTMENT : "+this.department);
			
		// call randomPassword method
		this.password = randomPassword(defaulPasswordLength);
		// System.out.println("Your PASSWORD is : "+this.password);
		
		// concatenate all elements to form email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Your Email is : "+email);
		
	}
	
	// to ask for department	
	private String setDepartment() {
	System.out.print("Mr/Mrs "+firstName+" please enter your department code\n 1 - for Sales\n 2 - for Development\n 3 - for Accounting\n 0 - for none\n Enter code : ");	
	Scanner s = new Scanner(System.in);
	int depchoice = s.nextInt();
	if(depchoice==1) {	return "sales";  }
	else if(depchoice == 2) { return "devt";  }
	else if(depchoice == 3) { return "acct";  }
	else { return"";	}	
	
	}
	
	// to generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
		char[] password = new char[length];
		for (int i=0;i<length;i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// to set mailbox capacity
	public void setmailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// to generate alternate email
	public void setAlternameEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// to change passsword
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getmailboxCapacity() {
		return mailboxCapacity;    }
	
	public String getAlternateEmail() {
		return alternateEmail; 	}
	
	public String getPassword() {
		return password;	}
	
	public String showInfo() {
		return " DISPLAY NAME : " + firstName + " "+ lastName + 
				" \n COMPANY EMAIL : "+ email +
				" \n MAILBOX CAPACITY : "+ mailboxCapacity + "mb";
	}
}

