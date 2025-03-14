package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열05_re {

	public static void main(String[] args) {		
		//7명 점수를 입력 받아서, 총점과 평균을 구하기
		
		Scanner sc = new Scanner(System.in);
		int[] student = new int[] {-10, -52, -5, 8, 6, 75, 33};
		
		int sum = 0;
		for(int i=0; i<7; i++){
			sum += student[i];
		}
		
		double average = sum/7.0;
		System.out.printf("총점:%d, 평균:%.2f\n", sum, average);
		System.out.println("7번째 값 출력 : " + student[6]);
		
		System.out.println("--------------------------------");
		
		//최대값과 최소값 구해보기 {-10, -52, -5, 8, 6, 75, 33}
		
		int max = student[0];
		int min = student[0];
		
		for(int i=0; i<7; i++) {
			if(max < student[i])
			   max = student[i];
			if(min > student[i])
				min = student[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("--------------------------------");
		
		/*
	    	{-10, -52, -5, 8, 6, 75, 33}
	    	키보드 : 1 입력하면, 출력 : 1값은 4번째 위치입니다.
	    	키보드 : -3 입력하면, 출력 : -3값은 2번째 위치입니다.
	    	반복문, 조건문
	    */
		
		int index = -1;
		System.out.println("찾을 숫자를 입력하세요.");
		int numA = sc.nextInt();
		
		for(int i=0; i<7; i++) {
			if(numA == student[i]) {
				index = i;
			}
		}
		
		if(index != -1)
			System.out.printf("%d값은 %d번째 위치입니다.\n", numA, index+1);
		else
			System.out.printf("%d값은 찾을 수 없습니다.\n", numA);
	}

}
