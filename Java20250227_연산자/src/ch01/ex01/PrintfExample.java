package ch01.ex01;

public class PrintfExample {

	public static void main(String[] args) {

		System.out.print("Hello, Java");
		System.out.print("Hello, Java");
		System.out.println();
		System.out.println("Hello, Java");
		System.out.println("Hello, Java");
		System.out.println();
		
		System.out.printf("Hello, Java\n");
		System.out.printf("Hello, Java");
		
		int a = 10;
		int b = 20;
		double c = 10.257;
		
		System.out.println();
//		System.out.println("a=" + a + ", " + "b=" + b);
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		
		System.out.printf("a=%d, b=%d, c=%.1f\n", a, b, c);
		System.out.printf("a=%d, b=%d, c=%.2f\n", a, b, c);
		System.out.println();

		int a1 = 10;
		int a2 = 100;
		int a3 = 1000;
		int a4 = 10000;
		int a5 = 100000;

		int b1 = 10;
		int b2 = 100;
		int b3 = 1000;
		int b4 = 10000;
		int b5 = 100000;
		
		System.out.println("a1=" + a1 + ", b1=" + b1);
		System.out.println("a2=" + a2 + ", b2=" + b2);
		System.out.println("a3=" + a3 + ", b3=" + b3);
		System.out.println("a4=" + a4 + ", b4=" + b4);
		System.out.println("a5=" + a5 + ", b5=" + b5);
		System.out.println();

        System.out.printf("a1=%-10d, b1=%-6d\n", a1, b1);
        System.out.printf("a2=%-10d, b2=%-6d\n", a2, b2);
        System.out.printf("a3=%-10d, b3=%-6d\n", a3, b3);
        System.out.printf("a4=%-10d, b4=%-6d\n", a4, b4);
        System.out.printf("a5=%-10d, b5=%-6d\n", a5, b5);
        System.out.println();
        
        
        
/* System.out.println("a1=&%d, b1=%d", a1, b1);
 * The method println(int) in the type PrintStream is not applicable for the arguments (String, int, int)
 */

		String str = "Hello";
		System.out.println("str=" + str);
		System.out.printf("str=%s\n", str);
        
	}

}
