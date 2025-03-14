package ch01.ex02;

import java.util.Scanner;

public class 버스요금03_정답3 {

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
		
		int age = 0;
		int fee = 2000; //버스요금
		double rate = 0; //할인율
		
		System.out.println("나이 입력 : ");
		age = sc.nextInt();	
		
		if(age >= 65 || age <= 5) {
			rate = 0;
		}else if(age>=19) {
			rate = 1;
		}else if(age>=13) {
			rate = 0.75;
		}else if(age>=6) {
			rate = 0.5;
		}

		fee = (int)(fee * rate);
		System.out.println("버스 요금 : " + fee + "원입니다.");
				
				
		System.out.println("종료");
	}

}
