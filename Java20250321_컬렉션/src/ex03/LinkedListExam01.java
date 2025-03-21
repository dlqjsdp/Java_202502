package ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam01 {

	public static void main(String[] args) {

//		ArraryList<String> , LinkedList<String> 모두 가능하지만
//		List<String>가 수정에 용이하기 때문에 List<String>로 사용.
		List<String> list = new LinkedList<String>(); //베옇이 만들어졌다.
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		for(String str : list)
			System.out.println(str);
		System.out.println();
		
		list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		System.out.println();
		
		list.clear();  //all 삭제
//		System.out.println(list.get(0));
		
	}

}
