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

public class 함수매개변수있고반환값없는경우02 {

	public static void main(String[] args) {
		sum(10, 20); //함수 호출
		System.out.println("프로그램 종료!!");
	}
	
	//함수 정의
	public static void sum(int n1, int n2) {
		//코드 구현
		System.out.println("void sum(int n1, int n2) 함수 호출!!");
		System.out.println(n1+n2);
	}

}
