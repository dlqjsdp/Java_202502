package ch01.ex06;

public class Account {
	
	private int balance;

	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	int getBalance() {
		return balance;
	}
	
	void setBalance(int balance) {
//		if(MIN_BALANCE <= balance <= MAX_BALANCE) X
//		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) X
	
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
		this.balance = balance;		
	}
	

}
