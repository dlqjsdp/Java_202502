package ch01.ex09;

public class A {
	private String name;
	
	A(String name){
		this.name = name;
	}
	
	void funcA() {}
	void test() {
		System.out.println("A()");
	}
	
}

class B extends A{
	private String address;
	
	B(String name, String address){
		super(name);
		this.address = address;
	}
	
	void funcB() {}
	@Override //어노테이션
	void test() {
		System.out.println("B()");
	}
}

class C extends B{
	private int age;
	
	C(String name, String address, int age){
		super(name, address);
		this.age = age;
	}
	
	void funcC() {}
	@Override
	void test() {
		super.test();
		System.out.println("C()");
	}
}