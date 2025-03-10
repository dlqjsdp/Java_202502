package ch01.ex02;

import java.util.Random;

public class CarMain {

	public static void main(String[] args) {
		
		
		//정적 메소드를 객체 생성하지 않고,
		//클래스명, 정적 메소드명 실행 가능
		//클래스명, 정적변수명 실행 가능
		Car.runState();
		System.out.println(Car.companyState);
		
/*
	    Car car1 = new Car(); 
	    //public Car() {} 실행 
	    car1.displayInfo();
	    Car.runState(); 
	    System.out.println();
	  
	    Car car2 = new Car("기아", "K5", "흰색", 200); 
	    //public Car(String company,String model, String color, int maxSpeed) 실행 
	    car2.displayInfo();
	    car2.runState(); 
	    System.out.println();
	    
	    Random random = new Random();
	    int num1 = (int)(random.nextInt()*45) +1; //인스턴스 메소드
	    
	    int num2 = (int)(Math.random()*45)+1; // 정적메소드
	 
*/
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = new Car();
		
	}

}
