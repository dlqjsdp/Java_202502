package ex03;

import java.util.Arrays;

/*
 * def is_even(n):
  numbers = []
  for i in n:
    if i % 2 == 0:
      numbers.append(i)
  return numbers  

numbers = [1,2,3,4,5,6,7,8,9,10]

result = is_even(numbers)
print(result)
 */

public class Exam01 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	      
	      int[] arr = is_even(numbers);
	      
//	      for(int i : arr)
//	         System.out.print(i + " ");
	      System.out.println(Arrays.toString(arr)); 
	      //간단하게 배열 출력하는 방법. 단순 출력이 목적이라면 이것도 가능함.
	      //배열에 어떤 값이 담겨있는지 궁금할때 사용가능.
	      System.out.println(Arrays.toString(numbers));
	   }
	   
	
	static int[] is_even(int[] n) {
//		int[] arr = new int[10];
//		
//		for(int i=0; i<n.length; i++) {
//			if(n[i] % 2 == 0)
//				arr[i] = n[i];
//		}
//		return arr;
		
		int count = 0;
		
		//짝수 갯수 구하기
		for(int i : n) {
			if(i%2==0)
				count++;
		}
		
		int[] arr = new int[count];
		int index = 0;
		
		for(int i : n) {
			if(i%2==0)
				arr[index++] = i;
				//index++;
		 
		}
		return arr;
	}

}
