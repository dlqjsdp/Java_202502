package ch07.sec07.exam07;

public class Member {
	
	//필드
	private String name;
	private String id;
	private String password;
	private int age;
	
	//디폴트 생성자
	Member(){}

	//생성자
	Member(String name, String id){
		this.name = name;
		this.id = id;

	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("id : " + id);
   }
}
