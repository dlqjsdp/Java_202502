package ch01.ex01;

import java.util.Scanner;

/*
 * 반환X, 매개변수X
 */

public class Function04 {

	public static void main(String[] args) {
		
		//매개변수 없음
		add();
		
		System.out.println("result = ");
	}

	static void add() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>>");

//		String name = sc.nextLine();
//		System.out.println(name);
		//위 문장 두개를 하나로 합치면 아래 문장이 나온다. 의미는 둘다 같다.
		System.out.println(sc.nextLine());
		
		//반환이 없다는 것은 return을 지우거나 아래와 같이 return에 값이 없으면 됨.
		return ;
	}

}
