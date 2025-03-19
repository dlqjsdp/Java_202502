package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam12 {

	public static void main(String[] args) {
		
//		FileInputStream fis = new FileInputStream("./src/ex01/test.txt");

		try {
			FileInputStream fis = new FileInputStream("src/ex01/test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("프로그램 종료!");
	}
	

}
