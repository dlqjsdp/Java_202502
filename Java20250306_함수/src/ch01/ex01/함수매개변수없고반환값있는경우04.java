package ch01.ex01;
/*
 *********** 함수 ***********
 * 입력(매개변수)   출력(반환값)
 *     O           O
 *     O           X
 *     X           O
 *     X           X
 *     
 *    함수 정의 -> 함수 만드는 것
 *    함수 호출 -> 만든 함수를 실행하는 것
 *     
 */

public class 함수매개변수없고반환값있는경우04 {

	public static void main(String[] args) {
		double result = sum(); // 이 코드 실행화면 결과는 double result = 3.14159;
		System.out.println(result);
		System.out.println("프로그램 종료!!");
	}
	
	//함수 정의
	public static double sum() {
		//코드 구현
		System.out.println("void sum() 함수 호출!!");
		double pi = 3.14159;
		return pi; // return 값을 반환한다. (n1+n2 => 정수값)
	}

}
