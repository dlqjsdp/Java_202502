package ex01;

public class Exam01 {

	public static void main(String[] args) {
		
		String name = "여행";
		
		System.out.println(name);
		System.out.println(name.length());
		
		String temp = name;
		
		name = "영화";
		System.out.println(name);
		//System.out.println(name.length());
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1 == name2);
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		System.out.println(name3 == name4);
		
		System.out.println(name1.equals(name2));
		System.out.println(name3.equals(name4));
		
		String old1 = "자바 프로그래밍";
		String new1 = old1.replace("자바", "JAVA");
		
		System.out.println(new1);
		System.out.println(old1);
		
		String str = "koreakoreakorea";
		
		System.out.println(str.indexOf('r'));
		System.out.println(str.lastIndexOf('r'));
		
		String board = "번호,제목,내용,성명";
		String[] board1 = board.split(",");
		System.out.println(board1[0]);
		System.out.println(board1[1]);
		System.out.println(board1[2]);
		System.out.println(board1[3]);
		
		
		String[] str1 = new String[3];
		
		str1[0] = "java";
		str1[1] = "java";
		str1[2] = new String("java");
		
		System.out.println(str1[0] == str1[1]); // true : 같은 객체 참조
		System.out.println(str1[0] == str1[2]); // false : 다른 객체 참조
		System.out.println(str1[0].equals(str1[2])); // true : 문자열이 동일
	}

}
