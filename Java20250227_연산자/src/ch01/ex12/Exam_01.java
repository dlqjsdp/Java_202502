package ch01.ex12;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// 이름, 나이
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String strX = scanner.nextLine();
		System.out.printf("이름 : %s", "노유경\n");
		

		System.out.println("나이 입력 : ");
		String strY = scanner.nextLine();
		System.out.printf("나이 : %d", 30);
		


	}

}
