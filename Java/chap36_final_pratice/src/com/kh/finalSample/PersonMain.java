package com.kh.finalSample;

public class PersonMain {
	public static void main(String[] args) {
		PersonMain Per = new PersonMain();
		Person[] pArray  = new Person[1];
		
		pArray[0] = new Person("KH");
		
		for(int i = 0; i<= pArray.length;i++) {
			System.out.println(pArray[i].getPerson());
	}
		
	}
	
	
	
}
