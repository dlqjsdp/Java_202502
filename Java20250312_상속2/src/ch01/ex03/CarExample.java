package ch01.ex03;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체 생성
		Car myCar = new Car();
		
//		myCar.run(); --> tire의 참조변수가 없기 떄문에 오류발생
		// Car 클래스의 public Tire tire; 에서 Tire은 클래스, tire은 참조변수
		
		//Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		//HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		//KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
	}

}
