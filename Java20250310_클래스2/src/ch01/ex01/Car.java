package ch01.ex01;

public class Car {
	//필드선언
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	

	//디폴트(기본)생성자 습관적으로 만들기
	public Car() {
//		this.company = "현대";
//		this.model = "그랜저";
//		this.color = "검정";
//		this.maxSpeed = 250;
		this("현대", "그랜저", "검정", 250);
	}
		
	public Car(String company, String model) {
//		this.company = company;
//		this.model = model;
//		this.color = "검정";
//		this.maxSpeed = 250;
		this(company, model, "검정", 250);
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
