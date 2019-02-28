import java.util.Scanner;

public class user {
	
	Scanner sc = new Scanner(System.in);
	
	String user_first_name;
	String user_last_name;
	int account_type;
	
	public user() {}
	
	public String get_user_first_name() {
		return user_first_name;
	}
	
	public void set_user_first_name(String name_input) {
		user_first_name = name_input;
	}
	
	public String get_user_last_name() {
		return user_last_name;
	}
	
	public void set_user_last_name(String name_input) {
		user_last_name = name_input;
	}
	
	public int get_account_type() {
		return account_type;
	}
	
	public void set_account_type() {
		System.out.println("Please input one of the fallowing:");
		System.out.println("Admin");
		System.out.println("Customer");
		System.out.println("Teller");
		//input
		int type_input_int= 0;
		
		do {
			String type_input = sc.nextLine();
			
			if (type_input.equalsIgnoreCase("Admin")) {
				type_input_int = 1;
			} else if (type_input.equalsIgnoreCase("Customer")) {
				type_input_int = 2;
			} else if (type_input.equalsIgnoreCase("Teller")) {
				type_input_int = 3;
			} else {
				System.out.println("Try Again");
			}

		} while (type_input_int == 0);
		
		
		switch (type_input_int) { 
        case 1: 
            account_type = 1; 
            System.out.println("User Type was set to Admin");
            break; 
        case 2: 
        	account_type = 2; 
        	System.out.println("User Type was set to Customer");
            break; 
        case 3: 
        	account_type = 3; 
        	System.out.println("User Type was set to Teller");
            break; 
        default: 
            System.out.println("Invalid Input"); 
            break; 
        } 
    }
	
	public void display_User() {
		System.out.printf("User Information:\n"
				       +  "First Name: %s "
				       +  "Last Name: %s"
				       +  "User Type: %d", user_first_name,user_last_name,account_type);
	}
}
