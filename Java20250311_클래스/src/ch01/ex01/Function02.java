package ch01.ex01;
/*
 * 반환O, 매개변수O
 * 객체생성X
 */

public class Function02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);
		
		System.out.println("result = " + result);
	}
	//객체를 생성하지 않고 진행하려면 꼭 static을 앞에 붙여야함. 
    //(static을 쓴 이유는 객체를 생성하지 않고 쓰겠다는 뜻)
	static int add(int n1, int n2) {
		return n1 + n2;
	}

}
