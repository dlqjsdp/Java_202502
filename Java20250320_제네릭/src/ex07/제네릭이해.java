package ex07;
/*
 *  T : 타입인자
 *  T extends A : T에게 전달되는 대상은 A이거나 A 하위클래스만 전달 가능
 */


class Box<T extends A>{
	private T Obj;

	public T getObj() {
		return Obj;
	}

	public void setObj(T Obj) {
		this.Obj = Obj;
	}	
}

class A{}
class B extends A{}
class C extends B{}

class D{}
class Person{}
class Car{}

public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
		
		
		//Box<D> dBox = new Box<>();
		//Box<Person> pBox = new Box<>();
		//Box<Car> cBox = new Box<>();
		
		


	}

}
