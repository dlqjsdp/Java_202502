package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// double > float > long > int > short > byte
		
		double d1 = 10.2;
		
		int i1 = 10;
		
		d1 = i1;
		d1 = (double)i1;
		
		short s1 = 10;
		
		i1 = s1;
		i1 = (int)s1;
		
		s1 = (short)i1;
		
		
		int a = 40000;
		short b = (short)a;
		
		System.out.println(b);
		
		int c = 30000;
		short d = (short)c;
		
		System.out.println(d);
		

	}

}
