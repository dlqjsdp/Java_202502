package ex01;

public interface RemoteControl {
	//일반 메소드는 올 수 없음.
	
	
//	(public static final) int MAX_VOLUME = 10;
//	(public static final) 생략 가능함. 
//	RemoteControl이 객체를 생성할 수 없기떄문에 생략하는게 디폴트값.
	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	/*
	 * interface 상수
	 * 멤버변수 생성 불가
	 * 정적변수만 생성 가능
	 */

	//추상 메소드
	public void turnOn();
	
	//추가 추상메소드
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	//default 일반메소드에 사용하면 에러남.
	default void 신기능() {
	}
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	

}
