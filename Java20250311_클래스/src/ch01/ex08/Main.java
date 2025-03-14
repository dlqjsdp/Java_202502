package ch01.ex08;

public class Main {

	public static void main(String[] args) {
		
		A aa = new A();
		aa.funcA();
		
		B bb = new B();
		
		B b2 = new B("지리산", 50, "전라남도 남원시");
		b2.funcA();
		b2.info();
		b2.funcB();
		System.out.println();		
		b2.infoB();
	}

}
