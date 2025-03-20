package ex04;

public class BoxExample {

	public static void main(String[] args) {
		
//		int i = 100;
//		Integer obj = new Integer(100); //박싱 : 자동으로 변환해줌
//		
//		int num = obj.intValue(); //언박싱
		
		int i = 100;
		int j = 25;
		int k = 20;
		
		//변수3개의 최대걊 구하기
		int max = Math.max(Math.max(i, j), k); 
		
		System.out.println(max);
	}

}
