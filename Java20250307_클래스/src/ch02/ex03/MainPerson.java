package ch02.ex03;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p = new Person("김대철", 50);
		String msg = p.introduce();
		System.out.println(msg);
				
	}

}
