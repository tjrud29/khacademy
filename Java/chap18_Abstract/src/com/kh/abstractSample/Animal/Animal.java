package com.kh.abstractSample.Animal;

public abstract  class Animal {
	//�ʵ� S name;
	private String name;
	//������ 
	public Animal(String name) {
		this.name = name;
	}
	//�߻�޼��� �����Ҹ���� void makeSound();
	public abstract void makeSound();
	//�Ϲݸ޼��� �����̸���� void displayName();
	public void displayName() {
		System.out.println("�����̸� : " + name);
	}
}