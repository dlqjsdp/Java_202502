package ex09;

public class MobileTest {

	public static void main(String[] args) {
		
		// 각각의 Mobile 객체를 생성한다. 
//		Mobile mobile = new Mobile():
//		추상클래스는 미완성클래스이기 때문에 위 문장처럼 객체를 생성할 수 없다.
//		대신 아래와 같이 객체는 생성 가능
		Mobile ltab = new Ltab("Ltab", 500, "ABC-01");
		Mobile otab = new Otab("Otab", 1000, "XYZ-01");
		
        // 생성된 객체의 정보를 출력한다.(printMobile() 호출) 
		printTitle();
		printMobile(ltab);
		printMobile(otab);
		System.out.println();
		
        // 각각의 Mobile 객체에 10분씩 충전을 한다.  
		ltab.charge(10);
		otab.charge(10);
		
        // 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출) 
		System.out.println("[10분 충전]");
		printTitle();
		printMobile(ltab);
		printMobile(otab);
		System.out.println();
		
        // 각각의 Mobile 객체에 5분씩 통화를 한다.
		ltab.operate(5);
		otab.operate(5);
		
        // 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)
		System.out.println("[5분 통화]");
		printTitle();
		printMobile(ltab);
		printMobile(otab);
		System.out.println();

	}
	
	//Mobile mobile = ltab; Mobile mobile이 ltab을 참조하고 있다.
	//Mobile mobile = otab; Mobile mobile이 otab을 참조하고 있다.
	public static void printMobile(Mobile mobile) {
		System.out.println(mobile.getMobileName() + "\t\t"
				+mobile.getBatterySize() + "\t\t" + mobile.getOsType());
	}
	
	public static void printTitle() {
		System.out.println("Mobile\t\tBattery\t\tOS");
		System.out.println("----------------------------------------");
	}

}
