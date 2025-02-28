package ch01.ex11;

import java.util.Scanner;

public class ConditionalOperationExample2 {

	public static void main(String[] args) {

		// 점수 입력을 표시해서 점수를 입력하면 등급을 표시하게 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
