package ch01.ex05;

import java.util.Scanner;

public class Exam_문제1 {

	public static void main(String[] args) {
		/*
		 * 키보드를 통해서 4000을 입력 받은 후
		 * 시 분 초를 구하는 프로그램 구현
		 * 입력 : 4000
		 * 출력 : 1시간 6분 40초
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 :");
		String str = sc.nextLine();
	
		int totalSeconds = Integer.parseInt(str);
		
		int hours = totalSeconds / 3600; // 1시간 구함
		//System.out.println(hours);
		
		int minutes = (totalSeconds % 3600) / 60; // 6분 구함
		//System.out.println(minutes);
		
		int seconds = totalSeconds %60;
		//System.out.println(seconds);
		
		System.out.printf("total 초 : %d, 시간:%d 분:%d 초:%d\n", 
				totalSeconds, hours, minutes, seconds);
		
		
		
		
/*
 * 		Scanner scanner = new Scanner(System.in);
 *
 *		
 *		System.out.print("입력: ");
 *		String strA = scanner.nextLine();
 *		int a = Integer.parseInt(strA);
 *		
 *	 	int result = a/60;
 *	
 *		System.out.printf("%d시간, %d분, %d초", result);
 */
		
	}

}
