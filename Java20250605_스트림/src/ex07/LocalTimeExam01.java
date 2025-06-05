package ex07;

import java.time.Duration; // 시간 간격 측정용
import java.time.Instant; // 타임스탬프 (정확한 시각)
import java.time.LocalDate; // 날짜 (년-월-일)
import java.time.LocalDateTime; // 날짜 + 시간
import java.time.ZoneId; // 시간대
import java.time.format.DateTimeFormatter; // 날짜/시간 포맷 지정

public class LocalTimeExam01 {

	public static void main(String[] args) {

		// 1~100000까지 합 구하는 데 걸린 시간 측정
		long sum=0;

		Instant start  = Instant.now(); // 시작 시간 기록
		
		for(long i=1; i<=100000L; i++) // 합 계산
			sum += i;
		
		Instant end = Instant.now(); // 종료 시간 기록
		
		Duration between = Duration.between(start, end); // 두 시간 사이 간격 계산
		
		// 소요 시간 출력 (밀리초 → 초로 변환)
		System.out.println("소요 시간 : " + (between.toMillis()/1000.0) + "초");
		
		// 현재 날짜 출력
		LocalDate date = LocalDate.now();
		System.out.println("오늘 날짜 : " + date); // 예: 2025-06-05
		
		// 현재 시스템의 시간대 출력
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("Local Zone ID : " + zoneId); // 예: Asia/Seoul
		
		// ✅ 현재 날짜와 시간 출력
		LocalDateTime currentTime = LocalDateTime.now();  //현재 시스템 날짜/시간
		System.out.println("현재 시스템 날짜/시간 : " + currentTime); // 예: 2025-06-05T12:34:56.789
		
		// 날짜/시간 포맷 지정
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
		
		// 지정한 포맷으로 출력
		System.out.println("현재 날짜와 시간 : " + formatter.format(currentTime));
		// 예: 2025년 06월 05일 12:34:56
	}

}