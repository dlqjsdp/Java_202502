package ex04;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
//				.delete(3, 4)
				.toString();
		
		System.out.println(data);
		
		String data2 = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 5)   // 3번부터 5전까지 지운다. (3~4까지 지운다)
				.toString();
		
		System.out.println(data2);
		
		
		String data3 = new StringBuffer()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 5)
				.toString(); //여기서 toString이 없으면 문자열로 만들어지지 않아 참조할 수 없다.
		
		
		System.out.println(data3);
		
		StringBuilder buffer = new StringBuilder();
		
		String data4 = new String("ABC");
		
		
	}

}