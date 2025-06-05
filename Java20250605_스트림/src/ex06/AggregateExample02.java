package ex06;

/*
 * AggregateExample.java 파일
 * int[] arr = {}; 로 실행한 경우
 * 2의 배수만 추출하여 개수, 합계, 평균을 구하는 스트림 예제
 */

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateExample02 {

	public static void main(String[] args) {

		// 빈 배열 선언 (요소 없음)
        int[] arr = {};

        // 1. 2의 배수 개수 구하기
        long count = Arrays.stream(arr) // 배열을 스트림으로 변환
                           .filter(n -> n % 2 == 0) // 2의 배수만 필터링
                           .count(); // 필터링된 요소의 개수 세기
        System.out.println("2의 배수 개수 : " + count); // 출력: 0

        // 2. 2의 배수 총합 구하기
        int sum = Arrays.stream(arr)
                        .filter(n -> n % 2 == 0) // 2의 배수만 필터링
                        .sum(); // 총합 계산 (0)
        System.out.println("2의 배수 총합 : " + sum); // 출력: 0

        // 3. 2의 배수 평균 구하기 (OptionalDouble 반환)
        OptionalDouble avg = Arrays.stream(arr)
                                   .filter(n -> n % 2 == 0)
                                   .average(); // 평균 계산 (값이 없으면 비어 있음)

        // 평균값이 존재하는 경우 출력, 아니면 메시지 출력
        if (avg.isPresent()) {
            System.out.println("2의 배수 평균 : " + avg.getAsDouble());
        } else {
            System.out.println("2의 배수 평균 : 계산할 수 없음");
        }

        // 4. 평균값이 없을 때 기본값 0.0을 사용 (예외 없이 안전하게 처리)
        double safeAvg = avg.orElse(0.0);
        System.out.println("평균값 (orElse): " + safeAvg);
    }
}
