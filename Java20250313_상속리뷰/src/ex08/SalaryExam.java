package ex08;

import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//월 입력받기
		System.out.println("월을 입력하세요>>");
		int month = sc.nextInt();
		
		//등급 입력받기
		System.out.println("등급을 입력하세요>>");
		int grade = sc.nextInt();
		
		//
		SalaryExpr salary;
		if (month % 2 == 0) {
			salary = new SalaryExpr(100); //월이 짝수면 SalaryExpr(100)으로 객체 생성
		}else {
			salary = new SalaryExpr(); //월이 홀수면 SalaryExpr()으로 객체 생성
		}
		
		//최종 월급은 getSalary(grade)를 호출하여 계산
		int finalSalary = salary.getSalary(grade);
		
		System.out.println(month + "월 " + grade + "등급의 월급은 " + finalSalary + " 입니다.");
		
	}

}