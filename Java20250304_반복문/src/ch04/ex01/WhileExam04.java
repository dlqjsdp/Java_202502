package ch04.ex01;

import java.util.Scanner;

public class WhileExam04 {

	public static void main(String[] args) {

		/*
		 * //구구단 출력
		
		for(int i=2; i<=9; i++) {
			System.out.printf("*******%d단*******\n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%d\n", i, j, i*j);
			}
			System.out.println();
		}
		 */
		
		int i=2;
		
		while(i<=9) {
			int j=1;
			System.out.printf("*******%d단*******\n", i);
			while(j<=9) {
				System.out.printf("%dx%d=%d\n", i, j, i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
