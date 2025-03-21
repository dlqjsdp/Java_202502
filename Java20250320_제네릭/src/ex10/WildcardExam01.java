package ex10;

class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}	
	
	@Override
	public String toString() {
		return (String)obj;
	}
}

class A {}
class B extends A{}
class C extends B{}
class D extends C {}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
	
	//                                상한 제한  --> 목적 : 읽기전용, 쓰기 금지
	public static void peekBox1(Box<? extends B> box) {
//		System.out.println(box);
		box.getObj();
//		box.setObj(box); --> 에러 발생 읽기 전용으로 쓰기가 안됨.
	}
	
	//                                 하한 제한  --> 목적 : 쓰기전용, 읽기 금지
	public static void peekBox2(Box<? super C> box) {
//		System.out.println(box);
		box.getObj();
//		box.setObj(box);  --> 예제가 잘못된건지 에러 발생. 원래는 에러가 발생하면 안됨.
	}
}

public class WildcardExam01 {

	public static void main(String[] args) {
		Box<B> box = new Box<>();
//		box.setObj(new A());
		
		Unboxer.peekBox2(box);


	}

}
