package ch01.ex01;

public class A {
	private String name;
	
	A(String name){
		this.name = name;
	}
	
	A(){} //기본생성자 생성
	void funcA() {
		System.out.println("funcA()");
	}
}

class B extends A{
	private String address;
	
	B(String n2, String address){
		super(n2);
		this.address = address;
	}
	B(){}
	void funcB() {
		System.out.println("funcB()");
	}
}

class C extends B{
	private int age;
	
	C(String n, String a, int age){
		super(n, a);
		this.age = age;
	}
	C(){}
	void funcC() {
		System.out.println("funcC()");
	}
}
