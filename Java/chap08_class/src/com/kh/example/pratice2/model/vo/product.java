package com.kh.example.pratice2.model.vo;

public class product {
	String pName;
	int price;
	String brand;
	
	public product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	
	}
		public void information() {
			System.out.println("��ǰ�� :" + pName);
			System.out.println("���� :" + price);
			System.out.println("�귣�� :" + brand);
			
			
	
			
		
		
	}
}
