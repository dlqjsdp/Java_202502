package ex01;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
										// 홀수만 필터링 -> 홀수의 합
		int total = Arrays.stream(arr).filter(n -> n%2 ==1).sum();
		System.out.println(total);
											// 홀수만 필터링 -> 홀수의 평균
		double total2 = Arrays.stream(arr).filter(n -> n%2 ==1).average().getAsDouble();
		System.out.println(total2);
										// 홀수만 필터링 -> 홀수의 최대값
		int total3 = Arrays.stream(arr).filter(n -> n%2 ==1).max().getAsInt();
		System.out.println(total3);
		
								// 3의 배수만 필터링 -> 조건을 만족하는 요소의 개수만
		long count = Arrays.stream(arr).filter(i -> i%3==0).count();
		System.out.println(count);
		
								// 배열의 모든 요소를 스트림으로 순회하면서 출력
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		
	}

}