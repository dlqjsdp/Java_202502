package ch04.ex01;

public class WhileExam01 {

	public static void main(String[] args) {

		/*
		 * int sum = 0;
		         초기값   조건  증가/감소(변동)
		   for(int i=1; i<5; i++) {
		       sum +- i;
		   }
		   System.out.println("sum = " + sum); 
		 */
		
		int sum = 0;
		int i = 1; //초기값
		
		while(i<=5) { //조건
			sum += i;
			i++; //증가/감소
		}
		System.out.println("sum=" + sum);
		
	}

}
