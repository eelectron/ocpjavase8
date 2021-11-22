package ch10threads;

public class AccountDanger implements Runnable{
	private BankAccount account;
	public AccountDanger(BankAccount account) {
		this.account = account;
	}
	
	public void run() {
		int n = 10;
		int amt = 10;
		for(int i = 0; i < n; i++) {
			if(amt <= account.getBalance()) {
				System.out.println("Thread " + Thread.currentThread().getName() + " is going to withdraw");
				try {
					Thread.sleep(1000);
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
}