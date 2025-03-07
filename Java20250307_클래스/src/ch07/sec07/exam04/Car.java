package ch07.sec07.exam04;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	String getCompany() {
		return company;
	}
	
	//디폴트 생성자
	Car(){}

//	//생성자
//	Car(String model){
//		this.model = model;
//	}
//	
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
//	
//	Car(String model,String color, int maxSpeed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
	Car(String model){
    	this(model, "은색", 250);
    	}
	
	Car(String model, String color){
		this(model, color , 250);
	}
		
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
     	this.maxSpeed = maxSpeed;
	}
		
		
	
}
