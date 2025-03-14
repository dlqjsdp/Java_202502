package ch02.sec01;

public class BooleanExample {

	public static void main(String[] args) {
		
		boolean stop = true;
		
		stop = false;
		
		/*
		 * > : 크다
		 * >= : 크거나 같다
		 * < : 작다
		 * <= : 작거나 같다
		 * == : 같다
		 * != : 같지 않다.
		 * ! : 부정
		 * && : 그리고, and
		 * || : 혹은, 또는, or
		 */
		
		boolean check = (5>2) || (5>11);
		System.out.println(check);

	}

}
