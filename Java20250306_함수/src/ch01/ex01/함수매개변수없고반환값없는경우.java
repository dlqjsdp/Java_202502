package ch01.ex01;
/*
 *********** 함수 ***********
 * 입력(매개변수)   출력(반환값)
 *     O           O  -->03클래스
 *     O           X  -->02클래스
 *     X           O  -->04클래스
 *     X           X  -->01클래스
 *     
 *    함수 정의 -> 함수 만드는 것
 *    함수 호출 -> 만든 함수를 실행하는 것
 *     
 */

public class 함수매개변수없고반환값없는경우 {

	public static void main(String[] args) {
		sum(); //함수 호출
		System.out.println("프로그램 종료!!");
	}
	
	//함수 정의
	public static void sum() {
		//코드 구현
		System.out.println("void sum() 함수 호출!!");
	}

}
