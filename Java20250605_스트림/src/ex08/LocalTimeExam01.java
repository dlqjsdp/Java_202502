package ex08;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExam01 {

	public static void main(String[] args) {
		//Europe/Paris 시간 구하기
		
		// 사용 가능한 모든 ZoneId 중 "Asia"로 시작하는 것만 출력
		ZoneId.getAvailableZoneIds() // 모든 시간대 ID 가져오기
			  .stream()
			  .filter(s->s.startsWith("Asia")) // "Asia"로 시작하는 시간대만 필터링
			  .sorted() // 알파벳 순으로 정렬
			  .forEach(zoneId->System.out.println(zoneId)); // 하나씩 출력
		
		System.out.println(); // 줄바꿈
		
		// "Europe/Paris" 시간대의 현재 날짜와 시간 구하기
		ZonedDateTime parisDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
		// 날짜 및 시간 포맷 지정 (예: 2025-06-05 13:45:22)
		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		// 포맷 적용 후 출력
		System.out.println("paris 현재 날자와 시간 : " + fomatter.format(parisDateTime));
		
	}

}