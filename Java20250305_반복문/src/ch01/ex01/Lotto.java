package ch01.ex01;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
		
		int[] lotto = new int[6];
		int tmp;
		
//		for(int i=0; i<6; i++) {
//		tmp = (int)(Math.random()*45)+1;
//		lotto[i] = tmp;
//		}
		
		for(int i=0; i<lotto.length; i++) 
			lotto[i] = (int)(Math.random()*45)+1;
			//중복 체크 과정 필요
		
		
		
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i] + " ");
		
		
		
		


	}

}
