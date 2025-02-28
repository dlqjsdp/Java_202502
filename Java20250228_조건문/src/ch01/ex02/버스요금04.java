package ch01.ex02;

import java.util.Scanner;

public class 버스요금04 {

	public static void main(String[] args) {

		/*
		 * 버스요금 계산 프로그램
		 * 기본요금 : 2000
		 * 1~5세 : 무료
		 * 6~12세 : 50%할인
		 * 13~18세 : 25%할인
		 * 19~64세 : 0%할인
		 * 65세 이상 : 무료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = sc.nextInt();	
		
		int fare = 2000;
		
		
		
		if(age >= 65) {
			System.out.println("무료");
		}else if(age >= 19) {
			System.out.println(fare);
		}else if(age >= 13) {
			System.out.println(fare*0.75);
		}else if(age >= 6) {
			System.out.println(fare*0.5);
		}else {
			System.out.println("무료");
		}
		
		System.out.println("종료");
	}

}
