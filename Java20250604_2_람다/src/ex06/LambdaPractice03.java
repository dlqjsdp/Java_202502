package ex06;

/*
 * 출력 결과 : 미성년 성년 미성년 성년 미성년 성년 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice03 {

	public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 20, 3, 40, 5, 60);
        
        // 1. 짝수만 필터링
        List<String> evenNumbers = filterEvenNumbers(numbers,  num -> num >= 18 );
        
        for(String i : evenNumbers)
        	System.out.print(i  + " ");
        System.out.println("\n-------------------------------");
       
    }
	

    // 짝수만 필터링하는 메소드
    public static List<String> filterEvenNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
    	
    	List<String> list= new ArrayList<String>();
    	
    	for(int n : numbers) {
    		if(predicate.test(n)) {
    			list.add("성년");
    		}else {
    			list.add("미성년");
    		}
    	}
    	return list;
    }



}