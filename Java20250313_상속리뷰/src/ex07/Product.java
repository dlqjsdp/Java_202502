package ex07;

import java.text.DecimalFormat;

public class Product {
	
	private String name;
	private int balance;
	private int price;
	
	//기본생성자
	Product(){
		this("듀크인형", 5, 10000);
	}
	
	//인자값이 있는 생성자
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###");
		
		return name + " " + balance + " " + formatter.format(price) + "원";
	}

	String getName() {
		return name;
	}
	int getBalabce() {
		return balance;
	}
	int getPrice() {
		return price;
	}

	

}
