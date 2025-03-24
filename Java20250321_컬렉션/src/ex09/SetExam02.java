package ex09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import lombok.AllArgsConstructor;

class Person{
	String name;
	int age;
	
}
//                   정렬순서를 정해주겠다
class Num implements Comparable<Num>{

	private int num;
	
	public Num(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return num + "";
	}
	
	@Override
	public int hashCode() {
		System.out.println("-hashCode-");
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("-equals-");
		
		Num number = (Num)obj;
		
		return this.num == number.num;
	}

	@Override
	public int compareTo(Num o) {
		return Integer.compare(this.num, o.num);
	}	
}

public class SetExam02 {

	public static void main(String[] args) {
		
		Set<Num> set = new TreeSet<>();
		
	
		//정렬 조건이 없기 때문에 실행 불가
		
		set.add(new Num(1234));
		set.add(new Num(1357));
		set.add(new Num(1395));
		set.add(new Num(1234));
		set.add(new Num(1357));
		
		for(Num n : set)
			System.out.println(n);
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr;
		
		arr2[0] = 100;
				
		System.out.println(Arrays.toString(arr));
		
		
	
	}

}
