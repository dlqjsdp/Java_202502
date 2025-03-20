package ex05;

class A{
	
	public A() {
	}
	
	void funcA() {
		System.out.println("funcA()");
	}
	
	void funcC() {
		System.out.println("funcC()_A");
	}
	
	void funcB() {
		System.out.println();
	}

}

class B extends A{
	public B() {
	}

	void funcB() {
		System.out.println("funcB()");
	}
	
	void funcC() {
		System.out.println("funcC()_B");
	}
	
}

public class InherTest {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();		
		
		//상위클래스는 하위클래스 자원(메소드) 접근불가
		a1.funcA();
		a2.funcA();
		
		//접근할 수 있는 방법이 존재....메소드 오버로딩
		a1.funcC();
		a2.funcC();
		
		a1.funcB();
		a2.funcB();
	}

}