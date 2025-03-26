package ex02;

interface Animal{
	abstract public  void sound();
	public static final int NUM=0;
	
	//기존 구현한 클래스를 선태권을 준다.
	default void eat() {
		
	};
}

class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("멍멍~");
	}
}

class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("야옹~");
	}
}


public class MainClass {

	public static void main(String[] args) {
		
//		Animal an = new Animal();
		Animal an = new Dog();
//		Animal an2 = new Cat();
		
		Animal an3 = new Cat();
		
		an.sound();
		an3.sound();

	}

}
