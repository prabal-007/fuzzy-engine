package email_app;

public class Email_app {

	public static void main(String[] args) {
		Email em1 = new Email("Tony","Stark");
		
		// em1.setAlternameEmail(stark456@marvel.com);
		// em1.setmailboxCapacity(20);
		// em1.changePassword(pass12345);
		System.out.println(em1.showInfo());		
	}

}
