package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		dog gg = new dog("�۸���");
		gg.makeSound();
		System.out.println("============");
		//1. cat �����
		//Cat ct = new Cat("�����");
		//2. ��ü�迭�� Animal �����ؼ� ����ϱ� �������� Ȱ���� ��ü �ٷ��
		Animal[] animal = new Animal[2];
		animal[0] = new dog("�۸���");
		animal[1] = new Cat("�߿���");
		
		//�Ҹ� ���
		for(Animal a : animal) {
			a.displayName();
			a.makeSound();
			System.out.println();
		}
	}

}