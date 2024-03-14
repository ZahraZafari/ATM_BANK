import java.util.Scanner;

public class Account {
 // Class Variable
	int balance;
	int prevTransaction;
	String customerName;
	String customerID;
	
	// Class Constructor
	Account(String cname, String cid) {
		customerID = cid;
		customerName = cname;
	}
	
	void deposit(int amount) {
		if (amount != 0 && amount > 0) {
			balance = balance + amount;
			prevTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			prevTransaction = -amount;
		}
	}
	
	void getPrevTransaction() {
		if (prevTransaction > 0) {
			System.out.println("Deposited: " + prevTransaction);
		} else if (prevTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(prevTransaction));
		} else {
			System.out.println("No Transaction Occured!");
		}
	}
	
	void showDate() {
		System.out.println("Today's Date is: «6 March»");
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println();
		System.out.println("What would you like to do? 😀👐🏻");
		System.out.println();
		System.out.println("A. Check Your Balance");
		System.out.println("B. Make A Deposit");
		System.out.println("C. Make A Withdraw");
		System.out.println("D. View Pervious Transaction");
		System.out.println("E. Show Date");
		System.out.println("F. Exit");
	
	do {
		System.out.println();
		System.out.println("Please Enter an option: ");
		char option1 = scanner.next().charAt(0);
		option = Character.toUpperCase(option1);
		System.out.println();
		
		switch(option) {
		case 'A':
			System.out.println("=================");
			System.out.println("Balance = $" + balance);
			System.out.println("=================");
			break;
		case 'B':
			System.out.println("Enter an amount to deposit: ");
			int amount = scanner.nextInt();
			deposit(amount);
			break;
		case 'C':
			System.out.println("Enter an amount to Withdraw: ");
			int amount2 = scanner.nextInt();
			withdraw(amount2);
			break;
		case 'D':
			System.out.println("==============");
			getPrevTransaction();
			System.out.println("==============");
			break;
		case 'E':
			showDate();
			break;
		case 'F':
			System.out.println("=========");
			break;
		default:
			System.out.println("Error: Invalid Option. Please Enter A,B,C,D,E,F");
			break;
		}
	} while (option != 'F');
	System.out.println("Thank You For Using Our ATM!💙");
}
}

