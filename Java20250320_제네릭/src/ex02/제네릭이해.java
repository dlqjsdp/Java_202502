package ex02;

import lombok.Getter;
import lombok.Setter;

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


class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box aBox = new Box(); //사과
		Box oBox = new Box(); //오렌지
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple ap = (Apple)aBox.getObj();
		Orange op = (Orange)oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
	}

}