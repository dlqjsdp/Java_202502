package ch01.ex02;

public class Car {
	//필드선언
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	public static int count; //정적 변수
	
	static String companyState = "GM";
	
	static void stateFunc() {
		
	}
	
	//정적 메소드
	static void runState() {
		//정적 메소드 안에서 사용할 수 있는 변수 및 메소드는
		//static이 붙어있는 정적메소드 정적변수만 사용가능
		System.out.println("Static Run()");
		count++;
		companyState = "기아";
		stateFunc();
//		company = "현대";
//		run();
		
	}
	

	//디폴트(기본)생성자 습관적으로 만들기
	public Car() {
		//this(), super() => 함수 맨 앞에 와야함.
		this("현대", "그랜저", "검정", 250);
		System.out.println(++Car.count);
	}
	
	//생성자 생성
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	public void run() {
		System.out.println(company + "달린다.");
	}
	
	public void displayInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
	}

	
}
