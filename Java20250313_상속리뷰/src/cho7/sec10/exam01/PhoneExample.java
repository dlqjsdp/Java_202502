package cho7.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); -->에러 발생
		
		SmartPhone smartPhone = new SmartPhone("홍갈동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		

	}

}
