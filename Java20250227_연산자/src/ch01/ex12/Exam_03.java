package ch01.ex12;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// 이름, 나이
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt(); // 버퍼에서 정수만 읽음, 그리고 버퍼에는 엔터만 남아있음.
		System.out.println("나이는 " + age);
		
		sc.nextLine(); //버퍼 클리어 -> 버퍼에 남아있는 엔터를 읽어 공간을 비워주는 역할

		System.out.println("이름 입력 : ");
		String name = sc.nextLine(); // 버퍼에 있는 엔터까지 다 읽어서 버퍼가 비어있음
		System.out.println("이름은 " + name);
		


	}

}
