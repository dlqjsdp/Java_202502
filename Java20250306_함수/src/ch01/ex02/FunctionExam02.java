package ch01.ex02;

/*
 * 함수 2개 생성
 * 매개변수로 int[10] 배열 전달하면
 * 함수1는 20, 40, 60, 80, 100을 리턴하고
 * 함수2은 10, 30, 50, 70, 90을 리턴한다
 * 메인함수에서 두 함수를 호출하고, 각 전달받은 값을 출력한다
 */

public class FunctionExam02 {

	public static void main(String[] args) {
		int[] number = new int[10];
		
		for(int i=0; i<10; i++) {
			number[i] = (i+1)*10;

	    }
		
		for(int i=0; i<10; i++) 
			System.out.print(number[i] + " ");
			System.out.println();
			
		int resultA = evenSum(number);
		System.out.println(resultA);
		
		int resultB = oddSum(number);
		System.out.println(resultB);
		
		
	}
	
	public static int evenSum(int[] numA) { //짝수합
		
		int sum=0;
		for(int i=0; i<numA.length; i++) {
//			System.out.print(numA[i] + " ");
			
			int num = numA[i] / 10;
			if( num % 2 == 0 ) // if((numA[i] / 10 % 2 == 0))
				sum += numA[i];
		}
		return sum;
		
	}
	public static int oddSum(int[] numB) { //홀수합
		int sum = 0;
		
		for(int i=0; i<numB.length; i++) {
			if( (numB[i] / 10) % 2 == 1)
				sum += numB[i];
		}
			
		return sum;

	}
}
