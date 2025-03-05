package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열05 {

	public static void main(String[] args) {		
		
		//7명 점수를 입력 받아서, 총점과 평균을 구하기		
		Scanner sc = new Scanner(System.in);
		//예시>> int num = 0;
		int[] student = new int[]{10,-3,-700,1,2,9,3}; //원래는 0이었던 방에 미리 숫자를 입력하는 의미
		
		int sum = 0;
		double average = 0;
		//int max = 0; //변수 초기값 변경 가능
		//int min = 100;

		
		for(int i=0; i<7; i++) {
			sum += student[i];
		}
		
		average = sum/7.0;
		System.out.printf("총점:%d, 평균:%.2f\n", sum, average);				
		System.out.println("7번째 값 출력 : " + student[6]);				

		System.out.println("----------------------------------");
		//max {-1,-3,-700,1,2,9,3};
		
		int max = student[0];
	    int min = student[0];
		
		for(int i=0; i<7; i++) {
			if(max < student[i])
				max = student[i];
			
			//if(min > student[i]) // ? 오류발생 이유 -> min에 0이 들어가 있어서. min에 최소값보다 큰 숫자를 넣으면 됨
			//	min = student[i];
			
			if(min > student[i])
			    min = student[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min); 
		
		System.out.println("----------------------------------");
		
		/*
		    {10,-3,-700,1,2,9,3}
		    키보드 : 1 입력하면, 출력 : 1값은 4번째 위치입니다.
		    키보드 : -3 입력하면, 출력 : -3값은 2번째 위치입니다.
		    반복문, 조건문
		 */
			
		int index = -1;
		System.out.println("찾을 숫자를 입력>>");				
		int numA = sc.nextInt();
		int i = 0;
		
		for(; i<7; i++) {
			if(numA == student[i]) {
				index = i;
				break;
			}
		}

		if(index == -1)
			System.out.printf("%d값은 찾을 수 없습니다.\n" , numA);
		else
			System.out.printf("%d값은 %d번째 위치입니다.\n" , numA, index+1, i);
		
		System.out.println("----------------------------------");

		/*
		 *  {10,-3,-700,1,2,9,3}
		 * 
		 *  정렬해서 출력하기 ----> {-700, -3, 1, 2, 3, 9, 10}
		 */


	}
}