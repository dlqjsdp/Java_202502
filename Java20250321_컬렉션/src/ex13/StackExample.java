package ex13;


import java.util.Iterator;


class Car implements Iterable<Car>{
	private String model;
	
	public Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public Iterator<Car> iterator() {
		return null;
	}
	
}
	

public class StackExample {

	public static void main(String[] args) {

		}

}


