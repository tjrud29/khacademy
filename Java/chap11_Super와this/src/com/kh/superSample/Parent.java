package com.kh.superSample;
//��ӹ޾Ƽ� super() super. ������ Ȯ��
/*
 super = �θ� Ŭ������ ������ �޼��忡 �����ϱ� ���� ���
 super() = �θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ���
 			����Ŭ������ �����ڿ��� ù ��° �ٿ� ȣ�� �Ǿ�� ��!
 * */
public class Parent {
	String name;
	
	Parent() {
		System.out.println("�ڽ� Ŭ������ ���ڿ� �Ķ���� �������Դϴ�.");
	}
	
	Parent(String name) {
		this.name = name; //this��� �̸��� ����ؼ� �ν��Ͻ� ������ ���� �Ҵ�
		System.out.println("�θ� Ŭ������ ���ڿ� �Ķ���� ������ �Դϴ�!");
		System.out.println(" �̸� : "+name);
	}
	
	public void show() {
		System.out.println("�θ� Ŭ������ show �޼��� �Դϴ�.");
	}
}