package com.kh.abstractSample.Animal;

public class dog extends Animal{
	private String name;
	//������ super
	public dog(String name) {
		super(name);
		this.name = name;
	}
	//Override
	public void makeSound() {
		System.out.println("�۸�");
	}
}
