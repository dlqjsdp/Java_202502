package ch01.ex03;

public class IncraseExample3 {

	public static void main(String[] args) {
		//증감연산자 --> 전위, 후위
		
		int a = 1;
		int b = 0;
		
		b = ++a; // -> a 먼저 계산하고, 계산한 결과 a를 b에 대입해서 계산하기
//		System.out.println("a="+ a + ", b="+b);
		System.out.printf("a=%d, b=%d\n", a,b);
		
	
		int c = 1;
		int d = 0;
		
		d = c++; // -> d에 c를 먼저 대입하고, c 계산하기
		System.out.printf("c=%d, d=%d\n", c,d);
	}

}
