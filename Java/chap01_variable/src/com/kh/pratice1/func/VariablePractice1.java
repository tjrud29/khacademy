package com.kh.pratice1.func;

import java.util.Scanner;
public class VariablePractice1 {
	public static void main(String[] args) {
		//�̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		String name = sc.next();
		System.out.println(name);
		
		
		System.out.println("������ �Է����ּ���");
		String gender = sc.next();
		System.out.println(gender);
		
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.println("Ű�� �Է��ϼ���");
		double height = sc.nextDouble();
		System.out.println(height);
		
		//Ű 180.5cm�� 20�� ���� �ƹ����� �ݰ����ϴ�^^�� ��Ÿ������
		
		
		System.out.println("Ű" + height + "cm ��" + age +"��" + gender + name + "�� �ݰ����ϴ�^^" );
		
		
		
		
		
		
	}

}
