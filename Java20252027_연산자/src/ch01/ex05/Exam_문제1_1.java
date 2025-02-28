package ch01.ex05;

import java.util.Scanner;

public class Exam_문제1_1 {

	public static void main(String[] args) {
		/*
		 * 키보드를 통해서 4000을 입력 받은 후
		 * 시 분 초를 구하는 프로그램 구현
		 * 입력 : 4000
		 * 출력 : 1시간 6분 40초
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		String strA = scanner.nextLine();
		int a = Integer.parseInt(strA);
		
		int hours = a/3600;
		int minutes = (a%3600)/60;
		int seconds = a%60;
				
		System.out.print("출력 : ");
		System.out.printf("%d시간 %d분 %d초\n", hours, minutes, seconds);
		
		
		
	}

}
