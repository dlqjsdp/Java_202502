package ex06;

import java.util.function.BiFunction;
import java.util.function.Function;

//매개변수있고, 반환형 있는 경우
//사용자 정의 함수형 인터페이스 (덧셈)
@FunctionalInterface
interface AddInterface {
    int add(int num1, int num2);
}

// 사용자 정의 함수형 인터페이스 (제곱)
@FunctionalInterface
interface Test {
    int bbb(int num);
}

public class Exam01_2 {

	public static void main(String[] args) {
		
		// 1. 사용자 정의 인터페이스로 덧셈
        AddInterface a = (num1, num2) -> num1 + num2;
        System.out.println(a.add(5, 11));  // 출력: 16

        // 2. 자바 내장 BiFunction 사용 - Integer
        // public interface BiFunction<T, U, R>
        BiFunction<Integer, Integer, Integer> b1 = (i, j) -> i + j;
        int sum1 = b1.apply(10, 10);
        System.out.println(sum1);  // 출력: 20

        // 3. BiFunction 사용 - Double
        BiFunction<Double, Double, Double> b2 = (i, j) -> i + j;
        double sum2 = b2.apply(1.1, 2.2);
        System.out.println(sum2);  // 출력: 3.3
        
        // 4. 사용자 정의 인터페이스 Test 사용 - 제곱 계산
        Test t = (i) -> i * i;
        System.out.println(t.bbb(5));

        // 5. 내장 Function 인터페이스 사용 - 제곱 계산
        Function<Integer, Integer> t2 = (i) -> i * i;
        System.out.println(t2.apply(5));
    }


}