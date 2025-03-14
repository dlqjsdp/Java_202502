package ch01.ex09;

public class Main {

	public static void main(String[] args) {
		
		C c1 = new C("치악산", "강원도", 100);
// 이 상태에서 가장 먼저 해야할 일은 A에 생성자 만들기.
		
		
		c1.test();
		
		B b1 = new B("내장산", "전북");
		b1.test();
		
		
		A a1 = new A("지리산");
		a1.test();
		
	}

}
