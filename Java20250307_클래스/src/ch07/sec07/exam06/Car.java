package ch07.sec07.exam06;

/*
 * 요구사항
	1. brand(브랜드), model(모델명), year(연식)을 필드로 가짐.
	2.생성자를 통해 brand, model, year을 설정할 수 있음.
	3.starEngine() 메서드를 구현하여, "[brand][model]의 엔진이 시작되었습니다!"를 출력하도록 함.
	4.displayInfo() 메서드를 구현하여 "자동차 정보: [year]년식 [brand][model]"을 출력하도록 함.
	5.main 메서드에서 Car 객체를 생성하고 startEngine()과 displayInfo()를 호출하여 
	    실행 결과를 확인할 것.
 */

public class Car {
	
	private String brand;
	private String model;
	private String year;
	
	
	
//	void setBrand(String brand){
//		this.brand = brand;
//	}
//	
//	String getBrand(){
//		return brand;
//	}
	


	Car() {
		this("기아","K8","2024");
	}
	
	Car(String brand) {
		this(brand, "그렌저", "2024");
	}
	
	Car(String brand, String model) {
		this(brand, model, "2025");
	}
	
    Car(String brand, String model, String year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	void startEngine() {
//		System.out.println("["+ brand +"] ["+ model+"]의 엔진이 시작되었습니다!");
	    System.out.printf("[%s][%s]의 엔진이 시작되었습니다!\n", brand, model);		

	}
	
	void displayInfo() {
		System.out.println("["+year+"]년식 ["+ brand +"] ["+ model+"]");
//		System.out.printf("[%s]년식 [%s] [%s]", year, brand, model);
	}

}
