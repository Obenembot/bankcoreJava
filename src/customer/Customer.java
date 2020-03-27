package customer;

import java.util.List;

import account.Account;
import insufficientFundException.InsufficientFundException;
import person.Person;
import wrongPinException.WrongPinException;

public class Customer extends Person {

	private Account account;
// date n time
// place of transaction;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public static List<Customer> customerList = null;


	public void registerCustomer(String name, String surname, String email, long phone, Account account) {

		setName(name);
		setSurname(surname);
		setEmial(email);
		setPhoneNumber(phone);
		this.account = account;
		this.account.setBalance(this.account.getAmount());
	}

	public void deposit(long accountNumber, double amount) {

		for (int a = 0; a < Customer.customerList.size(); a++) {
			if (accountNumber == Customer.customerList.get(a).getAccount().getAccountNumber()) {
				Customer.customerList.get(a).getAccount()
						.setBalance(Customer.customerList.get(a).getAccount().getBalance() + amount);

				break;
			} // end checking if accountNumber exit
		}

	}

	// Withdraw Method Starts Here
	public void withdraw(int pin, double amount)/* throws InsufficientFundException */{
		for (int a = 0; a < Customer.customerList.size(); a++) {

			if (pin == Customer.customerList.get(a).getAccount().getPin()) {

				if (amount < Customer.customerList.get(a).getAccount().getBalance()) {

					Customer.customerList.get(a).getAccount()
							.setBalance(Customer.customerList.get(a).getAccount().getBalance() - amount);

					// throw new InsufficientFundException();
				} // end checking for balance
				else if (amount >= Customer.customerList.get(a).getAccount().getBalance()) {
					try {
						throw new InsufficientFundException(); // Insufficient Fund
					} catch (InsufficientFundException e) {
					System.out.println(e.getMessage());
						//throw e;
					}

				} // else for amount greater than

				break;

			} // end if pin is true checking for pin

		}

	} // Withdraw Method Ends Here

	// Balance Starts Here
	public double balance(int pin) {
		double balance = 0.0;
		for (int a = 0; a < Customer.customerList.size(); a++) {

			if (pin == Customer.customerList.get(a).getAccount().getPin()) {

				balance = Customer.customerList.get(a).getAccount().getBalance();

				break;

			} // end checking for pin

		}
		return balance;

	} // Balance Ends Here

	@Override
	public String toString() {
		return "Customer [account=" + account + super.toString() + "]";
	}

}
