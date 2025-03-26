package ex01;

abstract class Animal{
	abstract void sound();
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("멍멍~");		
	}	
}

abstract class Cat extends Animal{
	abstract void eat();
}

class A extends Cat{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
//		Animal an = new Animal();
		Animal an = new Dog();
//		Animal an2 = new Cat();
		
		Animal an3 = new A();

	}

}
