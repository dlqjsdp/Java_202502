package ch01.ex01;

import java.util.Scanner;

public class 복습04 {

	public static void main(String[] args) {
	   // 객체 참조변수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력>>");
		int number = sc.nextInt();
		
		//삼항연산자(조건연산자)
		// (조건판단) ? 참 : 거짓;
		//String msg = (number>0) ? "양수" : "음수" ;
		boolean check=false;
		
		String msg = ""; //문장이 하나면 중괄호 안써도 됨. 취향차이
		//if(number > 0) {
		//	msg = "양수";
		//}else {
		//	msg = "음수";
		//}
		
		if(number > 0) msg = "양수"; 
		else msg = "음수";

		
		
		System.out.println(msg);
		
	}

}
