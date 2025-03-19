package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExam06 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료!");
	}

}
