package ch10threads;

public class AccountDanger implements Runnable{
	private BankAccount account;
	public AccountDanger(BankAccount account) {
		this.account = account;
	}
	
	public void run() {
		int n = 5;
		int amt = 10;
		for(int i = 0; i < n; i++) {
			makeWithdrawal(amt);
			if(account.getBalance() < 0) {
				System.out.println("Account is overdrawn !");
				break;
			}
		}
	}
	
	private void makeWithdrawal(int amt) {
		if(account.getBalance() >= amt) {
			System.out.println("Thread " + Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.withdraw(amt);
			System.out.println("Thread " + Thread.currentThread().getName() + " has withdrawn. " + " Balance = " + account.getBalance());
		}
		else {
			System.out.println("Thread " + Thread.currentThread().getName() + " can not withdraw . " );
		}
	}
}