package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열04 {

	public static void main(String[] args) {		
		//7명 점수를 입력 받아서, 총점과 평균을 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int[] student = new int[7];
		int sum = 0;
		double average = 0;
		
		for(int i=0; i<7; i++) {
			System.out.println(i+1 + "번 학생의 자바점수");
			student[i] = sc.nextInt();
			sum += student[i];
		}
		
		average = sum/7.0;
		System.out.printf("총점:%d, 평균:%.2f\n", sum, average);				
	}

}
