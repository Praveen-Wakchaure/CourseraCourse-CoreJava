package week1.bankingProject;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank account
 * 
 * @author Praveen
 *
 */
public class Bank {

	public static void main(String[] args) {

		// creates new instance of Bank Class
		Bank bank = new Bank();

		// calls the run method in bank class
		bank.run();

	}

	/**
	 * Runs the program by initializing and managing, bank accounts and customers
	 */
	public void run() {
		System.out.println("Welcome to the bank! What is your name?");

		// create scanner to get user input

		Scanner sc = new Scanner(System.in);

		// get customer name

		String name = sc.next();

		System.out.println("Hello" + name + "! We are creating checking and savings account for you.");

		// Create customer with given name

		Customer customer = new Customer(name);

		// get address

		System.out.println("What is your Address?");

		String address = sc.next();

		// set address

		customer.setAddress(address);

		// create a checking account

		BankAccount checkingAccount = new BankAccount("checking", customer);

		// create a saving account

		BankAccount savingAccount = new BankAccount("saving", customer);

		// get and prints customer info asociated with the checking account
		System.out.println();
		System.out.println("Customer Info: ");
		System.out.println(checkingAccount.getCustomerInfo());

		// get and prints customer info for accounts
		System.out.println("Checking Account:");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Saving Account:");
		System.out.println(savingAccount.getAccountInfo());

		// deposits

		// into checking

		System.out.println();
		System.out.println("Ämount to deposit into your checking account?");
		double amount = sc.nextDouble();
		checkingAccount.deposit(amount);

		// into checking

		System.out.println();
		System.out.println("Ämount to deposit into your saving account?");
		amount = sc.nextDouble();
		savingAccount.deposit(amount);

		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());

		// withdrawals

		// from savings
		System.out.println();
		System.out.println("Ämount to withdraw into your checking account?");
		amount = sc.nextDouble();

		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		// from savings
		System.out.println();
		System.out.println("Ämount to withdraw into your saving account?");
		amount = sc.nextDouble();

		try {
			savingAccount.withdraw(amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		
		//print new balance
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());

		sc.close();
	}

}
