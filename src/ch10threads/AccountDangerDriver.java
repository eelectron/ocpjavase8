package ch10threads;

public class AccountDangerDriver {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		AccountDanger ad = new AccountDanger(account);
		Thread t1 = new Thread(ad);
		Thread t2 = new Thread(ad);
		
		t1.start();
		t2.start();
	}
}
