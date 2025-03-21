package ex05;

/*
DBox<Person, String> pBox = new DBox<>();
class DBox<Person,String>{
	private Person left;
	private String right;
	
	public void set(Person left, String right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}
*/

class DBox<L,R>{
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
	
}

/*
 class DBox<String,Integer>{
	private String left;
	private Integer right;
	
	public void set(String left, Integer right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
	
}
 
 */

class Person{}


public class MutiTypeParam {

	public static void main(String[] args) {
		
		DBox<String, Integer> iBox = new DBox<String, Integer>();
		//앞에는 무조건 문자열, 뒤에는 무조건 정수만 위치할 수 있음. 타입을 제한했다.
		
		iBox.set("홍길동", 20);
		
		System.out.println(iBox);
		
//		pBox.set(new Person, "한국인"); 을 입력하려면 어떻게 바꿔야될까?
		DBox<Person, String> pBox = new DBox<>(); 
//		DBox<Person, Integer> iBox = new DBox<String, Integer>(); 과 동일
//		pBox.set(new Person(), "한국인");
		
		Person p = new Person();
		pBox.set(p, "AAA");
		
	}

}
