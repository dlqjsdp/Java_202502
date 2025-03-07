package ch02.ex03;
/*
	문제1 : Person 클래스 만들기
	package명 ch02.ex03
	아래 요구사항에 맞게 Person클래스를 생성하세요.
		 
	요구사항
	1.name(이름), age(나이)를 필드로 가짐.
	2.생성자를 통해 name과 age를 설정할 수 있음.
	3.introduce() 메서드를 구현하여 "안녕하세요, 제 이름은 [name]이고, [age]살입니다." 라는 문자열을 반환하도록 함.
	4.main 메서드에서 Person 객체를 생성하고 introduce()를 호출하여 결과를 출력할 것
*/

public class Person {
	
//	public static void main(String[] args) {
//		
//		Person p = new Person("김대철", 50);
//		String msg = p.introduce();
//		System.out.println(msg);
//   }
	
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	String introduce() {
		return "안녕하세요, 제 이름은 [" + name + "]이고, [" + age + "]살입니다.";
//		System.out.printf("안녕하세요, 제 이름은 %s이고, %d살입니다", name, age);
	}

}
