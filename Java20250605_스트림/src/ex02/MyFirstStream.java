package ex02;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		// 문자열 길이값 출력  2     3       4       5         6
		String[] arr = {"AA", "BBB", "CCCC", "DDDDD", "EEEEEE"};
		
		// 전통적인 `for-each` 반복문
		for(String str : arr) {
			System.out.print(str.length() + " ");
		}
		System.out.println(); // 각 문자열의 길이를 출력
		
		// 길이 출력
		Arrays.stream(arr)
			.map(n-> n.length()) // 각 문자열을 그 길이(int)로 변환
			.forEach(n-> System.out.print(n + " ")); // forEach(...): 변환된 길이들을 출력

		// 전체 문자열 길이의 합 구하기
		int total = Arrays.stream(arr)
				.mapToInt(n->n.length()) // mapToInt(...): IntStream으로 변환 (sum 등 숫자 연산이 가능)
				.sum(); // .sum(): 문자열 길이들의 총합 → 2 + 3 + 4 + 5 + 6 = 20
		
		System.out.println("\n" + total);
		
	}

}