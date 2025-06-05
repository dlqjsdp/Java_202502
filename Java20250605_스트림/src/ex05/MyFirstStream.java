package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class MyFirstStream {

	public static void main(String[] args) {
		
		// 1. 문자열 리스트 생성 및 출력
		List<String> list = Arrays.asList("alice", "bob", "charlie");
		// list.add("AAA"); => Arrays.asList()로 만든 리스트는 크기 변경 불가!
		System.out.println("문자열 리스트 : " + list); // 출력: [alice, bob, charlie]
		
		// 2. 모든 문자열을 대문자로 출력
		System.out.println("대문자로 변환한 각 문자열 : ");
		list.stream()
			.map(str-> str.toUpperCase())  // 각 문자열을 대문자로 변환
			.forEach(n-> System.out.println(n + " ")); // 각 요소 출력
		
		System.out.println();
		
		// 3. 대문자로 변환된 값을 리스트로 저장
		List<String> upperCaseNames = list.stream()
									.map(str->str.toUpperCase())
									.collect(Collectors.toList());
//									.toList();
		
//		upperCaseNames.add("FFFF");
		System.out.println("대문자로 변환된 리스트 : " + upperCaseNames); // 출력: [ALICE, BOB, CHARLIE]
		
		// 4. 정수 배열 선언
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(arr); // 배열 전체 출력
		
		// 5. 3의 배수만 필터링하여 출력
		System.out.print("3의 배수만 출력 : ");
		Arrays.stream(arr) // int[] → IntStream 생성 (1,2,3,4,5,6,7,8)
			  .filter(n-> n%3==0) // 3의 배수만 필터링
			  .forEach(n->System.out.print(n + " ")); // 3, 6
		System.out.println();
	    
		// 6. 짝수를 List<Integer>로 변환 (불변 리스트)
		// .toList() 생성된 리스트는 수정, 삭제 불가
		List<Integer> iList= Arrays.stream(arr) 
									.filter(n-> n%2==0) // 2,4,6,8
									.boxed() // int → Integer
									.toList(); //Arras.asList() → 불변 리스트
		System.out.println("짝수 리스트 (불변) : "+ iList);
		
//		iList.add(10); // ❌ 오류: 불변 리스트라 추가 불가
//		iList.remove(0); // ❌ 오류
		System.out.println(iList);

		// 7. 짝수를 List<Integer>로 변환 (수정 가능한 리스트)
		// collect(Collectors.toList()) 수집한 리스트는 수정, 삭제 가능
		List<Integer> iList2 = Arrays.stream(arr) 
				.filter(n-> n%2==0)
				.boxed()
				.collect(Collectors.toList()); // 가변 리스트
		System.out.println("짝수 리스트 (가변) : "+ iList2); // 출력: [2, 4, 6, 8]
		
		// 수정 가능
		iList2.add(10); // 10 추가
		iList2.add(100); // 100 추가
		iList2.remove(0); // 2 삭제
		System.out.println("수정 후 리스트: " + iList2);; // 출력: [4, 6, 8, 10, 100]
		
		
	}

}