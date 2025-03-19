package ex01;

import java.util.Scanner;

public class ExceptionExam02 {

	public static void main(String[] args) {
		
		//int num = 10/0; ArithmeticException 발생
		
		int[] arr = new int[5];
		
		arr[4] = 100;
		
		//arr[5] = 10; ArrayIndexOutOfBoundsException
		
		String str = null;
		
		//System.out.println(str.length()); NullPointerException
		 if(str != null)
			 System.out.println(str.length());
		 
		 String str2 = "korea";
		 
		 if(str != null)
			 System.out.println(str2.length());
	}

}
