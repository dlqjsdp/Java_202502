package ex06;

//매개변수있고, 반환형 있는 경우
@FunctionalInterface
interface MaxInterface{
	int max(int num1, int num2);
//	int add(int num1, int num2);
}

public class Exam01 {

	public static void main(String[] args) {
		
		//익명클래스
		MaxInterface max1 = new MaxInterface() {
			@Override
			public int max(int num1, int num2) {
				return (num1 > num2) ? num1 : num2 ;
			}
		};
		
		//람다
		MaxInterface max2 = (num1, num2) ->  (num1 > num2) ? num1 : num2 ;
		// 여기서 return을 생략한 이유 : 
		// 자바에서는 한 줄짜리 표현식인 경우 return과 중괄호 {}를 생략 가능
		
		System.out.println(max1.max(5, 1));

		System.out.println(max2.max(5, 11));
		
		
		// 람다
//		AddInterface a = (num1, num2) -> num1 + num2;
//		System.out.println(a.add(5,11));
		
//		public interface BiFunction<T,U,R>
/*
		BiFunction<integer, Integer, Integer> b1 = (i, j) -> i + j;
		int sum = b1.apply(10, 10);
				
		BiFunction<Double, Double, Double> b1 = (i, j) -> i + j;
		double sum = b1.apply(1.1, 2.2);
*/
//		System.out.println(sum);
	}

}