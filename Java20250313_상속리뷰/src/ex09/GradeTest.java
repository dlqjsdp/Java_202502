package ex09;

import java.util.Scanner;

public class GradeTest {

	 public static void main(String[] args) {
		 
	     Scanner scanner = new Scanner(System.in);

	     // 처리할 데이터 개수 입력받기
	     System.out.print("처리할 데이터 개수를 입력하세요: ");
	     int size = scanner.nextInt();

	     // 입력된 크기의 int 배열 생성
	     
	     int[] scores = new int[size];

	     // 배열에 데이터 저장
	     System.out.println("점수를 입력하세요:");
	     for (int i = 0; i < size; i++) {
	    	 scores[i] = scanner.nextInt();
	     }


	      // GradeExpr 객체 생성 및 결과 출력
	      GradeExpr gradeExpr = new GradeExpr(scores);
	      System.out.println("총점 : " + gradeExpr.getTotal());
	      System.out.println("평균 : " + gradeExpr.getAverage());
	      System.out.println("최고 점수 : " + gradeExpr.getGoodScore());
	      System.out.println("최저 점수 : " + gradeExpr.getBadScore());

	    }
	}
