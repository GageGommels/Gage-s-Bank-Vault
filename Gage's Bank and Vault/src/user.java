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
		int type_input = sc.nextInt();
		
		switch (type_input) { 
        case 1: 
            account_type = 1; 
            break; 
        case 2: 
        	account_type = 2; 
            break; 
        case 3: 
        	account_type = 3; 
            break; 
        default: 
            System.out.println("Invalid Input"); 
            break; 
        } 
        System.out.println("Account type Set!"); 
    } 

}
