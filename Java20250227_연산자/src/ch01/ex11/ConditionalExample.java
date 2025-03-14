package ch01.ex11;

import java.util.Scanner;

public class ConditionalExample {

	public static void main(String[] args) {
		// 삼항 연산자(조건 연산자)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력:");
		
		int number = sc.nextInt();
		
		//String result = (number > 0) ? "양수입력함" : "음수입력함";
		
		//절대값으로 출력
		int result = (number > 0) ? number : -number;
		
		System.out.println(result);
		
			

	}

}
