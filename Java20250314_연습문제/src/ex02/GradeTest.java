package ex02;

import java.util.Scanner;

/*
-처리하려는 데이터의 갯수를 표준 입력으로 받는다.(Scanner사용)
-입력된 값을 크기로 갖는 int타입 배열을 생성한다.
-표준입력으로 데이터를 받아서 첫 번째 원소부터 마지막 원소까지 저장한다.
-저장된 원소 값들을 하나의 행에,기호로 분리하여 출력한다.
-만들어진 배열을 전달하면서 GradeExpr객체를 생성한 후에 
총점과 평균을 구하는 메서드를 호출하여 
수행 결과를 다음과 같은 형식으로 화면에 표준 출력한다.
총점: ...
평균: ...
최고 점수: ...
최저 점수: ..
 */

public class GradeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 개수>>");
		int count = sc.nextInt();
		
//		-입력된 값을 크기로 갖는 int타입 배열을 생성한다.
		int[] nArr = new int[count];
		
//		-표준입력으로 데이터를 받아서 첫 번째 원소부터 마지막 원소까지 저장한다.
		for(int i=0; i<nArr.length; i++) {
			System.out.println("정수 입력>>");
			nArr[i] = sc.nextInt();
		}
//		-저장된 원소 값들을 하나의 행에,기호로 분리하여 출력한다.
		for(int i=0; i<nArr.length; i++) {
			System.out.print(nArr[i] + ", ");
		}
		System.out.println();
		
//		만들어진 배열을 전달하면서 GradeExpr객체를 생성한 후에
//		총점과 평균을 구하는 메서드를 호출하여 
//		수행 결과를 다음과 같은 형식으로 화면에 표준 출력한다.
		GradeExpr expr = new GradeExpr(nArr);
		
		System.out.println("총점 : " + expr.getTotal());
		System.out.println("평균점 : %.2f\n" + expr.getAverage());
		System.out.println("최고 : " + expr.getGoodScore());
		System.out.println("최소 : " + expr.getBadScore());
	}

}
