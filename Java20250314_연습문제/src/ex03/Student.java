package ex03;

public class Student extends Human{
	private String number;
	private String major;
	
	Student(){}
	Student(String name, int age, int height, 
			int weight, String number, String major){
		super(name, age, height, weight); //부모클래스 생성자 호출
		this.major = major;
		this.number = number;
	}
	
	@Override
	public String printInformation() {
		return super.printInformation() + number + "\t" + major;
	}
	@Override
	public String toString() {
		return super.printInformation() + number + "\t" + major;
	}
	

}
