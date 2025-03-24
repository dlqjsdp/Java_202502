package ex12;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Coin{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Coin(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

public class StackExample {

	public static void main(String[] args) {
		Queue<Coin> coinBox =  new LinkedList<Coin>();
//		Queue<Coin> coinBox =  new ArrayDeque<Coin>();
//		                      LinkedList 대신에 ArrayDeque도 가능함.
//		                      java document에서 자세하게 확인 가능함.
	
		coinBox.add(new Coin(100));
		coinBox.add(new Coin(50));
		coinBox.add(new Coin(500));
		coinBox.add(new Coin(50));

		for(Coin c : coinBox)
			System.out.println(c);
		
		System.out.println();
		Iterator<Coin> itr = coinBox.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		}

}


