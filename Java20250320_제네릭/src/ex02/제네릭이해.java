package ex02;


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
	private Object Obj;

	public Object getObj() {
		return Obj;
	}

	public void setObj(Object Obj) {
		this.Obj = Obj;
	}	
}




public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box aBox = new Box(); //사과
		Box oBox = new Box(); //오렌지
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple ap = (Apple)aBox.getObj();
		Orange op = (Orange)aBox.getObj();
		
		

	}

}
