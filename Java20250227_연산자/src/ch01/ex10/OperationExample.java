package ch01.ex10;

public class OperationExample {

	public static void main(String[] args) {

		int a = 1; //a = 1
		
		//a = a + 1
		//a = a +1;
		a += 1; //a = 2 =>1+1
		
		System.out.println(a);
 
		a++; //a = 3  =>2+1
		++a; //a = 4  =>3+1
		//a가 단독으로 변수이기 때문에 증감연산자는 변수의 앞뒤 어디에 붙어도 결과는 동일하다.
		System.out.println(a);
	
		a*= 3; //a = 12 =>4*3
		System.out.println(a);
		
		a -= 10; //a = 2 =>12-10
		System.out.println(a);
	}

}
