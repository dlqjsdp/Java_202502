package ch01.ex07;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = Account.getInstance();
		
		acc.setBalance(10000);
		System.out.println(acc.getBalance());
		
		Account acc2 = Account.getInstance();
		System.out.println(acc2.getBalance());
		
	}

}


