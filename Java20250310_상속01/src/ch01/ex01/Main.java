package ch01.ex01;


class A {
	String name;
	int age;
	
	A(){}
	
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	void run() {
		System.out.println("run()");
	}
	void eat() {
		System.out.println("eat()");
	}
}


//B클래스가 상위클래스인 A 클래스를 상속하겠다.
class B extends A{ 
	String id;
	
	B(){}
	B(String name, int age, String id) {
		super(name, age);
		this.id = id;
	}
}

final class C extends B{
	String pw;
	
	C(){}
		
	C(String name, int age, String id, String pw){
		super(name, age, id);
		this.pw = pw;
	}
	
	void displayInfo() {
		System.out.println("A class : " + name);
		System.out.println("A class : " + age);
		System.out.println("A class : " + id);
		System.out.println("A class : " + pw);
	}
}

//class D extends C{
//	
//}

public class Main {

	public static void main(String[] args) {

		C c = new C("홍길동", 20, "test", "1234");
		c.displayInfo();
	}

}
