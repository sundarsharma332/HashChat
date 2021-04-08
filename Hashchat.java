import java.util.*;

public class Hashchat {
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, Integer> people = new HashMap<String, Integer>();
	static Boolean login() {
		return false;
	}
	 
	static void welcomeinfo() {
		System.out.println();
		System.out.println(" *     *      *         * * *    *     *    * * *   *     *   * * * *   *******");
		System.out.println(" *     *     *  *       *        *     *    *       *     *   *     *      *   ");
		System.out.println(" * * * *    *  * *      * * *    * * * *    *       * * * *   *******      *   ");
		System.out.println(" *     *   *      *         *    *     *    *       *     *   *     *      *   ");
		System.out.println(" *     *  *        *    * * *    *     *    * * *   *     *   *     *      *   ");
		System.out.println();
		System.out.println("Welcocme to < HashChat />");
		System.out.println("Console Diaries");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("--- MADE WITH THE IMPLEMENTATIONS OF DATA STRUCTURE AND ALGORITHMS     --");
		System.out.println("-------------------------------------------------------------------------");
		UserMenu();
		
	}
	
	static void UserMenu() {
		System.out.print("1.LOGIN          2.SIGNUP  \n");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		  case 1: LoginHandlePage();
		          break;
		  case 2: SignUphandlePage();
		          break;  
		  default:
		    System.out.println("INVALID CHOICE\n");
		    UserMenu();
		}

		
	}
	static void LoginHandlePage() {
		System.out.println("---------------------------------------------------------");
		System.out.println("-                LOGIN PAGE                             -");
		System.out.println("---------------------------------------------------------");
		System.out.println("Enter the Username:");
		String username = sc.nextLine();
		System.out.println("Enter the Password:");
		String password = sc.nextLine();
		Boolean isLogin = LoginValidater(username , password);
		if(isLogin) {
			// user profile
			System.out.println("---------------------------------------------------------");
			System.out.println("- Welcome " + username + " to the HASHCHAT Community    -");
			System.out.println("---------------------------------------------------------\n");
		}
		else {
			System.out.println("INVALID CREDENTIALS :(");
			LoginHandlePage();
		}
		
		
	}
	
	
	
	static Boolean LoginValidater(String username, String password) {
		return true;
	}

	static void SignUphandlePage() {
		System.out.println("---------------------------------------------------------");
		System.out.println("-                SIGN UP PAGE                           -");
		System.out.println("---------------------------------------------------------");
		System.out.println("create the Username:");
		String username = sc.nextLine();
		System.out.println("Enter the Password:");
		String password = sc.nextLine();
		Boolean isSignUp = SignUpValidater(username , password);
		if(isSignUp) {
			LoginHandlePage(); 
		}else {
			System.out.println("ERROR OCCURED TRY AGAIN :(");
			SignUphandlePage();
		}
	}

	static Boolean SignUpValidater(String username, String password) {
		return false;
	}

	public static void main(String[] args) {
		welcomeinfo();

	}

}
