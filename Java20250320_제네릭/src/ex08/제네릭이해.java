package ex08;
/*
 *  T : 타입인자
 *  T extends Number : T에게 전달되는 대상은 Number이거나 Number 하위클래스만 전달 가능
 */

class Box<T extends Number>{
	private T Obj;

	public T getObj() {
		return Obj;
	}

	public void setObj(T Obj) {
		this.Obj = Obj;
	}	
}


public class 제네릭이해 {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box<>();
		ibox.setObj(10);
		
		Box<Double> dbox = new Box<>();
		dbox.setObj(10.2);
		
//		Box<String> sbox = new Box<>();
		//타입이 Number의 하위클래스가 아니기 때문에 에러발생.

	}

}
