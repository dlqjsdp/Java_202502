package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstStream {

	public static void main(String[] args) {
		
		List<String> list2 = new ArrayList<String>();
		list2.add("AA");		
		list2.add("BBB");		
		list2.add("CCCC");		
		list2.add("DDDDD");		
		list2.add("EEEEEE");	
		
		list2.remove(0); // "AA" 삭제
		list2.add("FF"); // "FF" 추가
		System.out.println("list2 : " + list2);
		
		                     //수정 불가 : Arrays.asList()로 만든 list는 크기 수정 불가
		List<String> list = Arrays.asList("AA", "BBB", "CCCC", "DDDDD", "EEEEEE");
		
	/*	위 코드를 수정/삭제하고 싶으면 list = new ArrayList<>(list); 복사해서 수정 가능한 리스트로 변경
		
		list = new ArrayList<>(list);
		list.remove(0); // 이제 삭제 가능
		for(String str : list)
			System.out.print(str + " ");
			
		정리 : Arrays.asList(...)로 만든 수정 불가능한 리스트를 
			→ new ArrayList<>(...)로 감싸서 수정 가능한 리스트로 바꾸는 것
	*/
		
		list.stream().map(n-> n.length()) // map()을 통해 문자열 → 길이로 변환
		.forEach(n-> System.out.print(n + " ")); // forEach()로 출력
		
		// Stream으로 전체 길이의 합 계산
		int count = list.stream().mapToInt(n->n.length()) // mapToInt()로 IntStream으로 변환
		.sum(); // sum()으로 총 길이 계산 : 2 + 3 + 4 + 5 + 6 = 20
		System.out.println(count);
		
		
		
		
	}

}