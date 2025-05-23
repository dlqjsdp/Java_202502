package ex02;

public class GradeExpr {
	private int[] jumsu; //배열이라는 뜻
	
//	private int sum = 0;
	
	public GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
	}
	
	int getTotal() {
		int sum = 0;
		for(int i=0; i<jumsu.length; i++)
			sum += jumsu[i];
		return sum;
	}
	
	double getAverage() {
		return (double)getTotal()/jumsu.length;
	}

	
	int getGoodScore() {
		int max = jumsu[0]; //배열의  첫번째 값을 0으로 초기화 한다.
		for(int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] > max) 
				max = jumsu[i];
		}
		return max;
	}
	
	int getBadScore() {
		int min = jumsu[0]; //배열의  첫번째 값을 0으로 초기화 한다.
		for(int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] < min) 
				min = jumsu[i];
			}
		return min;
	} 
}
