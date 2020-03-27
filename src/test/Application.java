package test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import account.Account;
import customer.Customer;
import insufficientFundException.InsufficientFundException;

public class Application {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Customer customer = null;
		Account account = null;

		Customer.customerList = new ArrayList<>();

		int a = 0, excp = 0, option = 0;
		do {
			try {
				scanner.nextLine();
				System.out.println("1. to Create Account");
				System.out.println("2. to Deposite");
				System.out.println("3. to Check Balance");
				System.out.println("4. to Withdraw");
				System.out.println("5. Dispaly");
				System.out.println("6. exit");
				option = scanner.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Wrong input");
			}

			String name = null, surname = null, email = null;
			long phone = 0, accountNumber = 0;
			double amount = 0;
			int pin = 0;

			switch (option) {

			case 1: // to Create Account"

				account = new Account();
				customer = new Customer();
				scanner.nextLine();
				System.out.println("<<<<<<<<<<<< Customer Infor >>>>>>>>>>>>");
				System.out.println("Name");
				name = scanner.nextLine();

				System.out.println("Surname");
				surname = scanner.nextLine();

				System.out.println("Email");
				email = scanner.nextLine();

				System.out.println("<<<<<<<<<<<< Account Infor >>>>>>>>>>>>");
				
				try {
					scanner.nextLine();
					System.out.println("Account Number");
					accountNumber = scanner.nextLong();
					account.setAccountNumber(accountNumber);
				} catch (InputMismatchException e) {
					System.out.println("wrong input");
				}

				try {
					scanner.nextLine();
					System.out.println("Pin");
					pin = scanner.nextInt();
					account.setPin(pin);
				} catch (InputMismatchException e) {
					System.out.println("wrong input");
				}

				try {
					scanner.nextLine();
					System.out.println("Make Deposite");
					amount = scanner.nextDouble();
					account.setAmount(amount);

					customer.registerCustomer(name, surname, email, phone, account);
					Customer.customerList.add(customer);

				} catch (InputMismatchException e) {
					System.out.println("wrong input");
				}

				break;

			case 2: // to Deposit"

				try {
					scanner.nextLine();
					System.out.println("Account Number");
					accountNumber = scanner.nextLong();
				} catch (InputMismatchException e) {
					System.out.println("wrong input");
				}
				
				try {
					scanner.nextLine();
					System.out.println("Amount");
					amount = scanner.nextDouble();

					customer.deposit(accountNumber, amount);
				} catch (InputMismatchException e) {
					System.out.println("wrong input");
				}
				break;

			case 3: // to Check Balance"

				try {
					scanner.nextLine();
					System.out.println("Pin");
					pin = scanner.nextInt();

					System.out.println(" Balance is  R" + customer.balance(pin));
				} catch (InputMismatchException e) {
					System.out.println("wrong input");
				}
				break;

			case 4: // to Withdraw

				try {
					scanner.nextLine();
					System.out.println("Pin");
					pin = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("wrong input \n");
				}

				try {
					scanner.nextLine();
					System.out.println("Amount");
					amount = scanner.nextDouble();

					customer.withdraw(pin, amount);
				} catch (InputMismatchException e) {
					System.out.println("wrong input \n");
				}
				break;

			case 5: // To Display

				for (Customer c : Customer.customerList) {
					System.out.println(c);
				}

				break;

			case 6: // to Exit
				System.gc();
				System.exit(0);

			} // end of switch
		} while (a < 10);

	}
}
