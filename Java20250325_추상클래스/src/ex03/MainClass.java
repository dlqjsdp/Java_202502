package ex03;

interface A{
	void sound();
}

class B implements A{

	@Override
	public void sound() {
		System.out.println("B~");
	}
}

class C implements A{
	@Override
	public void sound() {
		System.out.println("C~");
	}
}

class D extends B{
	
	void funcD() {
		System.out.println("funcD");
	}
	
	@Override
	public void sound() {
		System.out.println("D~");
	}
}

class E extends D{
	@Override
	public void sound() {
		System.out.println("E~");
	}
}


public class MainClass {

	public static void main(String[] args) {
		
		A a = new D();
		a.sound();
		
		D d = (D)a;
		d.funcD();
		
		((D)a).funcD();
		

	}

}
