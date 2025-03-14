package ch01.ex02;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		
		p1 = p2;

		/*
		 * p1, p2는 p2가 참조하는 객체를 동시에 참조하개 된다.
		 * p1이 참조한 객체는 일정시간이 지나면 메모리공간에서 소실된다.
		 * 
		 */
	}

}
