package ch01.ex03;

class CarMain {
	
	//인스턴스 변수
	int speed;
	
	//메소드
	void run() {
		speed = 100;
	}
	
	void eat() {
		speed = 100;
	}
	public static void main(String[] args) {

		CarMain car = new CarMain();
		car.speed = 200;
		System.out.println("main2()");
		
	}
	
}

class Car{

		
}
	


