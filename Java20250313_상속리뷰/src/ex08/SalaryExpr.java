package ex08;

public class SalaryExpr {
	private int bonus;
	
	//기본생성자 보너스를 0으로 초기화
	SalaryExpr(){
		this.bonus = 0;
	}
	
	//보너스가 있는 경우 생성자
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	
	//등급에 따라 보너스 값 더하고 반환
	int getSalary(int grade) {
		if (grade == 1) {
			return bonus + 100;
		}else if (grade == 2){
			return bonus + 90;
		}else if (grade == 3){
			return bonus + 80;
		}else if (grade == 4){
			return bonus + 70;
		}else {
			System.out.println("잘못된 등급입니다. 1~4 사이의 숫자를 입력하세요.");
			return -1; //오류값 반환
		}
				
	}

}