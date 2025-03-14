package ch01.ex04;

import java.util.Scanner;

public class 점수분석02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		
		while(flag) {
		System.out.println("-----------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("-----------------------");

		
		System.out.println("선택>");
		int num = Integer.parseInt(sc.nextLine());
		
		} //while
	}

}
