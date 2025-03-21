package ex06;


class Box<T>{
	private T Obj;

	public T getObj() {
		return Obj;
	}

	public void setObj(T Obj) {
		this.Obj = Obj;
	}	
}

class Person{}
class Car{}

public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box<String> sBox = new Box<>();
		sBox.setObj(null);
		
		Box<Integer> iBox = new Box<>();
		
		Box<Person> pBox = new Box<>();
		pBox.setObj(null);
		
		Box<Car> cBox = new Box<>();
		


	}

}
