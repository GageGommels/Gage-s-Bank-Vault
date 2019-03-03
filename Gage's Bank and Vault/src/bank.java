import java.util.ArrayList;
import java.util.Scanner;

public class bank {

	ArrayList<user> uAryLst = new ArrayList<user>(0); 
	static Scanner sc = new Scanner(System.in);
	static int terminate = 0;

	public static void main(String[] args) {
		do {
			print_menu();
			select();
		} while (terminate != 1);

	}

	public static void print_menu() {
		System.out.printf("What would you like to do?:\n" + 
						  "1) Create User\n" + 
						  "2) Create account\n" + 
						  "3) Exit Program\n" +
						  "4) Display User\n");
	}

	public static void select() {

		int bank_input = Integer.parseInt(sc.nextLine());

		switch (bank_input) {

		case 1:
			user new_user = new user();
			System.out.println("");
			
			System.out.printf("Cool you want to create a user! What will be the users first name?: ");
			String name_Input = sc.nextLine();
			new_user.set_user_first_name(name_Input);
			System.out.println("");
			
			System.out.printf("What will be the users Last name?: ");
			new_user.set_user_last_name(sc.nextLine());
			System.out.println("");
			
			System.out.println("Next you will be promted for user type:");
			new_user.set_account_type();
			break;
		case 2:
			break;
		case 3:
			terminate = 1;
			break;
		case 4:
			//new_user.display_User();
			break;

		}
	}
}
