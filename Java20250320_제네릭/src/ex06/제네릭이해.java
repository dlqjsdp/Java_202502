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
		Box<Integer> iBox = new Box<>();
		Box<Person> pBox = new Box<>();
		Box<Car> cBox = new Box<>();
		


	}

}
