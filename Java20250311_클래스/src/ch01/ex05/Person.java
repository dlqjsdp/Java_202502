package ch01.ex05;

/*
 * static(정적)  <==> 인스턴스
 * 인스턴스 변수(멤버변수), 인스턴스 메소드(멤버메소드)
 * 정적변수, 정적메소드
 */

public class Person {
	
	private String name;
	private int age;
	
	static int count; //정적변수
	
	static void f1() {}
	
	static void func() { //정적메소드
		System.out.println("정적메소드 func()");
		count++;
		f1();
//		age++; --> 앞에 static이 없어서 사용할 수 없음
//		eat++; --> 앞에 static이 없어서 사용할 수 없음
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String displayInfo() {
		return name + " : " + age;
	}
	
	void run() {
//		count++;
//		func();
//		eat();
//		age++; --> 써도 아무 문제 없다.
		System.out.println("run..........");
	}
	
	void eat() {
		System.out.println("eat..........");
	}
}
