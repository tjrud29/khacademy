package com.kh.Scannersample;

import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ���.");
		int age = sc.nextInt(); //������ �޴� next
		System.out.println("�� ���̴�" + age + "�Դϴ�.");
		
		String name;
		int phoneNumber;
		
		System.out.println("����� �̸��� �Է��ϼ���. :");
		name = sc.next();
		System.out.println("����� �̸���" + name + "�Դϴ�.");
		
		System.out.println("����� ��ȣ�� �Է��ϼ���. :");
		phoneNumber = sc.nextInt(); // -���� �ʱ�
		System.out.println("����� ��ȭ��ȣ�� " + phoneNumber+"�Դϴ�.");
		
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� 1�� ����ϱ�
		
		String hobby;
		String food;
		String address;
		System.out.println("��̸� �Է����ּ���");
		hobby = sc.next();
		System.out.println("��̴�" + hobby + "�Դϴ�.");      
		
		System.out.println("�����ϴ� ������ �Է����ּ���");
		food = sc.next();
		System.out.println("�����ϴ� ������" + food + "�Դϴ�.");
		System.out.println("�ּҸ� �Է����ּ���");
		address = sc.next();
		System.out.println("������ �ּҴ�" + address + "�Դϴ�.");
		
		
		
		
		
		
		
		
	}
	
}
