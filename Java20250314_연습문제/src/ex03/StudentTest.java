package ex03;

public class StudentTest {

	public static void main(String[] args) {

		Student students [] = new Student[3]; //변수명 임의로 변경 arrays -> students
		students[0] = new Student("홍길동", 20, 171, 81, "201101", "영문");
		students[1] = new Student("고길동", 21, 183, 72, "201102", "건축");
		students[2] = new Student("박길동", 22, 175, 65, "201103", "컴공");
		
		for(int i=0; i<students.length; i++) {
			String result = 
					students[i].printInformation();
			System.out.println(result);
		}
	}

}
	
//	Student s1 = new Student(
//			"홍길동", 20, 171, 81, "201101", "영문");
//	s1.getPrintInformation();
//	
//	Student s2 = new Student(
//			"고길동", 21, 183, 72, "201102", "건축");
//	s2.getPrintInformation();
//	
//	Student s3 = new Student(
//			"박길동", 22, 175, 65, "201103", "컴공");
//	s3.getPrintInformation();