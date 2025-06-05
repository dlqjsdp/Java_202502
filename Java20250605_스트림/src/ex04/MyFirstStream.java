package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MyFirstStream {

	public static void main(String[] args) {
		
		List<ToyPriceInfo> list = new ArrayList<ToyPriceInfo>();
		
		// 1. 리스트 생성 및 데이터 추가
		// 총 4개의 ToyPriceInfo 객체를 리스트에 추가
		list.add(new ToyPriceInfo("GUN", 2000));
		list.add(new ToyPriceInfo("CAR", 5000));
		list.add(new ToyPriceInfo("TEDDy", 3000));
		list.add(new ToyPriceInfo("SHIP", 7000));
		
		// 가격만 출력
		System.out.print("가격 : ");
		list.stream()
			.mapToInt(n -> n.getPrice())
			.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 2. 전체 가격 합계 출력
		int sum = list.stream()
				.mapToInt(price->price.getPrice()) // .mapToInt(...): 객체를 정수형 가격으로 변환
				.sum(); // .sum(): 가격 합 계산 : 가격: 2000 + 5000 + 3000 + 7000 = 17,000
		System.out.println("총합 : " + sum); // 출력: 17000
		
		
		// 3. 가격이 5,000 이상인 장난감 가격 합계 출력
		int total = list.stream()
		// .filter(...): 조건에 맞는 요소만 통과시킴 => 5000 이상인 항목: "CAR" (5000), "SHIP" (7000)
					.filter(price-> price.getPrice()>=5000)
					.mapToInt(price->price.getPrice())
					.sum(); // 총합: 5000 + 7000 = 12,000
		System.out.println("5000원 이상 가격 합 : "+ total); // 출력: 12000
		
		// 4. 가격이 5,000 이상인 상품명 출력
		System.out.print("5000원 이상 상품명 : ");
		list.stream()
				.filter(price-> price.getPrice()>=5000)
				.forEach(p -> System.out.print(p.getModel() + " "));

		
		
		
		
		
	}

}