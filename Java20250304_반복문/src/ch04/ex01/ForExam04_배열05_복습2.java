package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열05_복습2 {

	public static void main(String[] args) {		
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);
		
		printItem(new int[] {83, 90, 87});
	}
	
	public static void printItem(int[] scores) {
		for(int i=0; i<3; i++) {
			System.out.println("score["+i+"]: " + scores[i]);
		}
	}

}
