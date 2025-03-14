package ex01;

public class SalaryExpr {
	
	private int bonus;
	
	public SalaryExpr(){
		this.bonus = 0;
	}
	
	public SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	
	int getBonus() {
		return bonus;
	}
	
	//switch문와 if문 모두 가능
	int getSalaey(int grade) {
		
		switch(grade) {
		case 1:
			bonus += 100;
			break;
		case 2:
			bonus += 90;
			break;
		case 3:
			bonus += 80;
			break;
		case 4:
			bonus += 70;
			break;
		}
		
		return bonus;
		
	}

}
