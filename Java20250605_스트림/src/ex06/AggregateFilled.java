package ex06;

/*
 * AggregateExample.java 파일
 * int[] arr = {1,2,3,4,5,6,7,8,9,10}; 로 실행한 경우
 * 2의 배수만 추출하여 개수, 합계, 평균을 구하는 스트림 예제
 */

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateFilled {

    public static void main(String[] args) {

    	// 1~10까지의 정수 배열 선언
        int[] arr = {1,2,3,4,5,6,7,8,9,10};  // 2의 배수: 2, 4, 6, 8, 10

        // 1. 2의 배수 개수 구하기
        long count = Arrays.stream(arr) // 배열을 스트림으로 변환
                           .filter(n -> n % 2 == 0) // 2의 배수만 필터링
                           .count(); // 개수 세기
        System.out.println("2의 배수 개수 : " + count); // 출력: 5

        // 2. 2의 배수 총합 구하기
        int sum = Arrays.stream(arr)
                        .filter(n -> n % 2 == 0) // 2, 4, 6, 8, 10
                        .sum(); // 합: 30
        System.out.println("2의 배수 총합 : " + sum); // 출력: 30

        // 3. 2의 배수 평균 구하기
        OptionalDouble avg = Arrays.stream(arr)
                                   .filter(n -> n % 2 == 0)
                                   .average(); // 평균: 5.0 (OptionalDouble로 반환됨)

        // OptionalDouble에서 값이 있는 경우만 출력
        if (avg.isPresent()) {
            System.out.println("2의 배수 평균 : " + avg.getAsDouble()); // 출력: 5.0
        } else {
            System.out.println("2의 배수 평균 : 계산할 수 없음");
        }

        // 4. 값이 없을 경우를 대비하여 기본값 제공 (예외 방지)
        double safeAvg = avg.orElse(0.0); // 값이 없으면 0.0을 반환
        System.out.println("평균값 (orElse): " + safeAvg); // 출력: 5.0
    }
}