package ch10threads;

public class BankAccount {
	private int balance = 50;
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amt) {
		balance -= amt;
	}
}