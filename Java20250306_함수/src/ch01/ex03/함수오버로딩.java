package ch01.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {
		functionA(); // --> 1번 호출
		functionA(10); // --> 2번 호출
		functionA(10.2); // --> 3번 호출
		functionA(10, 2); // --> 4번 호출
		

	}
	
	public static void functionA() {
		System.out.println("functionA()");
	}
	public static void functionA(int n) { // 정수값 하나
		System.out.println("functionA(int n)");
	}
	public static void functionA(double n) {// 실수값 하나
		System.out.println("functionA(double n)");
	}
	public static void functionA(int n1, int n2) {// 정수값 두개
		System.out.println("functionA(int n1, int n2)");
	}

}
