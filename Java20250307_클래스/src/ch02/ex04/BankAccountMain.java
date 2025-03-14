package ch02.ex04;

public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount("김대철", 10000); //객체 생성
		
		b1.deposit(10000);
		b1.withdraw(1000000); //잔액부족..처리 안됨
		b1.withdraw(2000);
		
		
		System.out.println(b1.getBalance());
		
	}

}

