package ch01.ex02;

public class SwitchExam02 {

	public static void main(String[] args) {

		/*
		 * 학점(grade)
		 * 90 : A
		 * 80 : B
		 * 70 : C
		 * 60 : D
		 * 59 : F
		 */
		
		
		int grade = 65;
		
		
		switch(grade/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");

		}
	
		System.out.println("종료");
		
	}

}
