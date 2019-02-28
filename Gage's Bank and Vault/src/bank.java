import java.util.Scanner;

public class bank {
	
	static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			print_menu();
			
			int bank_input = sc.nextInt();
		
			
			switch (bank_input) {
			
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			
			}
		}
		
		
		public static void print_menu() {
			System.out.printf("What would you like to do?:	"
					+ "1) Create User"
					+ "2) Create account"
					+ "3) Exit Program");
		}
}
