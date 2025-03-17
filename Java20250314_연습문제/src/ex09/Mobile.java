package ex09;

public abstract class Mobile  {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	//기본생성자
	public Mobile(){} 
	
	//3개 값을 받아주는 생성자
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	/*
	 * 추상메소드 => Mobile을 상속하는 객체는 반드시 추상메소드를 재정의해서 사용헤라!!
	 * 추상클래스 => 객체를 생성할 수 없다.
	 */
	public abstract void operate (int time);
	
	public abstract void charge (int time);
	
	
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}


}
