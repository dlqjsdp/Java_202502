package ex05;


class Apple{
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am an orange.";
	}
}


class Box<T>{
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
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple ap = aBox.getObj();
		Orange op = oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
//		Box<String> sBox = new Box<String>(); 
//		//Box<String> 때문에 문자열만 입력할 수 있음
//		sBox.setObj("AAAAAA");
		
		Box<Integer> sBox = new Box<Integer>(); 
		//Box<Integer> 때문에 정수만 입력할 수 있음
		sBox.setObj(10);

	}

}
