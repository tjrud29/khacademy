package com.kh.pratice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		System.out.println(colors); 
		
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		System.out.println(colors);
		
		colors.set(1, "����");
		colors.set(3, "����");
		colors.set(5, "�׸�");
		System.out.println(colors);
		//1�� �ڸ��� ���ο� �߰�
		//���� 1�� ������ 2������ �ٲ�
		colors.add(1,"���ο�");
		System.out.println(colors);
		//���� ����
		colors.remove(2);
		System.out.println(colors);
		for(String  a : colors) {
			System.out.println(a);
		}
		System.out.println("������� : "+colors.get(1) + colors.get(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
