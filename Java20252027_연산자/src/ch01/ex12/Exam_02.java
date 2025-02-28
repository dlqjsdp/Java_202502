package ch01.ex12;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		// 이름, 나이
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine(); // 버퍼에 있는 엔터까지 다 읽어서 버퍼가 비어있음
		System.out.println("이름은 " + name);
		
		//sc.nextLine(); 버퍼클리어가 필요없음

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("나이는 " + age);
		


	}

}
