package ex01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter  //setter
@Getter  //getter
@NoArgsConstructor  //디폴트생성자 -> 기본생성자 Person(){}를 만들지 않아도 된다.
@AllArgsConstructor //모든 값을 가지는 생성자
class Person {
	private String name;
	private int age;

//	@AllArgsConstructor가 있어서 생성자를 만들지 않아도 된다.
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}

	
	@Override
	public int hashCode() {
		System.out.println("------hashCode------");
		int result = name != null ? name.hashCode():0;
		
		//자바에서는 객체 해시를 생성할때 필드들의 해시를 혼합할 목적으로 주로 31 소수값을 곱해줌
		result = 31 * result + age;
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		System.out.println("------equals------");
		Person o = (Person)obj;
		
		return this.age == o.age && this.name == o.name;
//		return this.name == o.name;
//		return this.age == o.age;
	}


}

public class PersonTest{
	
	public static void main(String[] args) {
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		System.out.println(str1.equals(str2));
		
		Person p1 = new Person("홍길동", 10);
		Person p2 = new Person("홍길동", 20);
		
		System.out.println(p1.equals(p2));
		
		Person p3 = new Person("홍길동", 10);
		Person p4 = new Person("홍길동", 20);
		
		System.out.println(p3.equals(p4));
	}
}