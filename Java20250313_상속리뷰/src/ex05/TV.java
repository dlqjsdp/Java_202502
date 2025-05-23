package ex05;
/*
 * 클래스 내부에 추상클래스가 1개 이상
 * 존재하면 그 클래스는 추상클래스이다.
 */
public abstract class TV { //--> 추상클래스에는 클래스 앞에 abstract를 붙여야한다,
	
	boolean power;
	
	TV(){
		power = false;
	}
	
	//추상메소드 --> {}가 없다.
	//
	abstract void powerOn();
	
	abstract void powerOff();
	
	abstract void volumeUp();
	
	abstract void volumedown();
	
	/*
	 * 메소드 4개
	 * 전원 켜고 끄는 기능
	 * 사운드 올리고 내리는 기능을 당담하는 메소드
	 */
	

}
