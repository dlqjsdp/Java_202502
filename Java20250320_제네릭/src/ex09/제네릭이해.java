package ex09;
/*
 * 제네릭 메소드
 */

class Box<T>{
	private T Obj;

	public T getObj() {
		return Obj;
	}

	public void setObj(T Obj) {
		this.Obj = Obj;
	}	
}

class BoxFactory{
	      // ststic을 쓴 건 객체생성하지 않고 호출하겠다는 뜻
	/*
	 * <T> : 제네릭 메소드 표시, Box<T> : 반환타입, T o : 매개변수
	 */
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box<>();
		box.setObj(o);
		return box;
	}
	
	/*
	 public static <String> Box<String> makeBox(String o){
		Box<String> box = new Box<>();
		box.setObj(o);
		return box;
	}
	 */
	
	/*
	 public static <Double> Box<Double> makeBox(Double o){
		Box<Double> box = new Box<>();
		box.setObj(o);
		return box;
	}
	 */
}

public class 제네릭이해 {

	public static void main(String[] args) {
		Box<String> sbox = BoxFactory.makeBox("Sweet");
		System.out.println(sbox.getObj());
		
		Box<Double> dbox = BoxFactory.makeBox(7.58);
		System.out.println(dbox.getObj());

	}

}

/*
class Box<String>{
	private String Obj;

	public String getObj() {
		return Obj;
	}

	public void setObj(String Obj) {
		this.Obj = Obj;
	}	
}
 */

/*
class Box<Double>{
	private Double Obj;

	public Double getObj() {
		return Obj;
	}

	public void setObj(Double Obj) {
		this.Obj = Obj;
	}	
}
 */


