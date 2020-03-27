package account;

public class Account {

	private long accountNumber;
	private double balance;
	private double amount;
	private int pin;

	public Account(long accountNumber, double balance, double amount, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.amount = amount;
		this.pin = pin;
	}

	public Account() {
		super();
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", amount=" + amount + ", pin="
				+ pin + "]";
	}

}
